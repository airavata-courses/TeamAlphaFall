echo 'Removing existing docker instances' >> /var/log/sga-docker.log 2>&1
sudo docker ps -a | grep 'run-forecast-service' | awk '{print $1}' | xargs --no-run-if-empty docker rm -f run-forecast-service