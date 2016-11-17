package org.team.omni.orchestration.engine.services;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.curator.x.discovery.ServiceDiscovery;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.ServiceProvider;

import org.glassfish.jersey.media.multipart.MultiPartFeature;

import org.team.omni.OrchestrationEngineValueStore;
import org.team.omni.exceptions.OrchestrationEngineException;
import org.team.omni.exceptions.ServiceCreationException;
import org.team.omni.weather.InstanceDetails;

public class ServiceFactory {
	private static final ServiceFactory SERVICE_FACTORY = new ServiceFactory();

	private OrchestrationEngineValueStore orchestrationEngineValueStore = OrchestrationEngineValueStore.getOrchestrationEngineValueStore();
	private Map<String, String> serviceAddressDirectory;
	private Client client;
	private ServiceDiscovery<InstanceDetails> serviceDiscovery = null;

	private ServiceFactory() {
		client = ClientBuilder.newBuilder().register(new MultiPartFeature()).build();
	}

	public void setServiceDiscovery(ServiceDiscovery<InstanceDetails> serviceDiscovery) {
		this.serviceDiscovery = serviceDiscovery;
	}

	public static ServiceFactory getServiceFactory() {
		return SERVICE_FACTORY;
	}

	public <T> T createService(Class<T> serviceClass) throws ServiceCreationException {
		if (serviceDiscovery == null) {
			throw new OrchestrationEngineException("Please set the service discovery");
		}
		try {
			String serviceName = serviceClass.getSimpleName();
			// =
			// ServiceDiscoveryBuilder.builder(InstanceDetails.class).basePath("services").client(curatorFramework).build();
			serviceDiscovery.start();
			ServiceProvider<InstanceDetails> serviceProvider = serviceDiscovery.serviceProviderBuilder().serviceName(serviceName).build();
			serviceProvider.start();
			Collection<ServiceInstance<InstanceDetails>> serviceInstances = serviceProvider.getAllInstances();
			serviceInstances.stream().map(ServiceInstance::buildUriSpec).forEach((String uri) -> System.out.println(uri));
			Optional<ServiceInstance<InstanceDetails>> requiredServiceInstance = serviceInstances.stream().min(Comparator.comparingInt((ServiceInstance<InstanceDetails> serviceInstance) -> serviceInstance.getPayload().getWorkLoad()));
			if (!requiredServiceInstance.isPresent()) {
				throw new ServiceCreationException("Service Could not be found");
			} else {
				ServiceInstance<InstanceDetails> serviceInstance = requiredServiceInstance.get();
				serviceInstance.getPayload().updateWorkLoad(1);
				serviceDiscovery.updateService(serviceInstance);
				return serviceClass.getConstructor(WebTarget.class, OrchestrationEngineValueStore.class).newInstance(client.target(serviceInstance.buildUriSpec()), orchestrationEngineValueStore);
			}
		} catch (Exception e) {
			throw new ServiceCreationException("Service: " + serviceClass.getName(), e);
		}
	}

	public void destroyService(Service service) throws ServiceCreationException {
		ServiceInstance<InstanceDetails> serviceInstance = service.getServiceInstance();
		serviceInstance.getPayload().updateWorkLoad(-1);
		try {
			serviceDiscovery.updateService(serviceInstance);
		} catch (Exception e) {
			throw new ServiceCreationException(e);
		}
	}

	@Deprecated
	public String getServiceAddress(Class<?> servcieClass) throws ServiceCreationException {
		String serviceClassName = servcieClass.getSimpleName();
		if (serviceAddressDirectory.containsKey(serviceClassName)) {
			return serviceAddressDirectory.get(serviceClassName);
		} else {
			throw new ServiceCreationException("Service Creation Failed for the service: " + serviceClassName);
		}
	}

	@Deprecated
	public Map<String, String> getServiceAddressDirectory() {
		return serviceAddressDirectory;
	}

	@Deprecated
	public void setServiceAddressDirectory(Map<String, String> serviceAddressDirectory) {
		this.serviceAddressDirectory = serviceAddressDirectory;
	}

}
