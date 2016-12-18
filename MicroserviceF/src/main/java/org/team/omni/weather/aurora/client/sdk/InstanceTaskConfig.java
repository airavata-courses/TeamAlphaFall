/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.team.omni.weather.aurora.client.sdk;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Maps instance IDs to TaskConfigs it.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class InstanceTaskConfig implements org.apache.thrift.TBase<InstanceTaskConfig, InstanceTaskConfig._Fields>, java.io.Serializable, Cloneable, Comparable<InstanceTaskConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InstanceTaskConfig");

  private static final org.apache.thrift.protocol.TField TASK_FIELD_DESC = new org.apache.thrift.protocol.TField("task", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INSTANCES_FIELD_DESC = new org.apache.thrift.protocol.TField("instances", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InstanceTaskConfigStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InstanceTaskConfigTupleSchemeFactory());
  }

  /**
   * A TaskConfig associated with instances.
   */
  public TaskConfig task; // required
  /**
   * Instances associated with the TaskConfig.
   */
  public Set<Range> instances; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * A TaskConfig associated with instances.
     */
    TASK((short)1, "task"),
    /**
     * Instances associated with the TaskConfig.
     */
    INSTANCES((short)2, "instances");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASK
          return TASK;
        case 2: // INSTANCES
          return INSTANCES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK, new org.apache.thrift.meta_data.FieldMetaData("task", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskConfig.class)));
    tmpMap.put(_Fields.INSTANCES, new org.apache.thrift.meta_data.FieldMetaData("instances", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Range.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InstanceTaskConfig.class, metaDataMap);
  }

  public InstanceTaskConfig() {
  }

  public InstanceTaskConfig(
    TaskConfig task,
    Set<Range> instances)
  {
    this();
    this.task = task;
    this.instances = instances;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InstanceTaskConfig(InstanceTaskConfig other) {
    if (other.isSetTask()) {
      this.task = new TaskConfig(other.task);
    }
    if (other.isSetInstances()) {
      Set<Range> __this__instances = new HashSet<Range>(other.instances.size());
      for (Range other_element : other.instances) {
        __this__instances.add(new Range(other_element));
      }
      this.instances = __this__instances;
    }
  }

  public InstanceTaskConfig deepCopy() {
    return new InstanceTaskConfig(this);
  }

  @Override
  public void clear() {
    this.task = null;
    this.instances = null;
  }

  /**
   * A TaskConfig associated with instances.
   */
  public TaskConfig getTask() {
    return this.task;
  }

  /**
   * A TaskConfig associated with instances.
   */
  public InstanceTaskConfig setTask(TaskConfig task) {
    this.task = task;
    return this;
  }

  public void unsetTask() {
    this.task = null;
  }

  /** Returns true if field task is set (has been assigned a value) and false otherwise */
  public boolean isSetTask() {
    return this.task != null;
  }

  public void setTaskIsSet(boolean value) {
    if (!value) {
      this.task = null;
    }
  }

  public int getInstancesSize() {
    return (this.instances == null) ? 0 : this.instances.size();
  }

  public java.util.Iterator<Range> getInstancesIterator() {
    return (this.instances == null) ? null : this.instances.iterator();
  }

  public void addToInstances(Range elem) {
    if (this.instances == null) {
      this.instances = new HashSet<Range>();
    }
    this.instances.add(elem);
  }

  /**
   * Instances associated with the TaskConfig.
   */
  public Set<Range> getInstances() {
    return this.instances;
  }

  /**
   * Instances associated with the TaskConfig.
   */
  public InstanceTaskConfig setInstances(Set<Range> instances) {
    this.instances = instances;
    return this;
  }

  public void unsetInstances() {
    this.instances = null;
  }

  /** Returns true if field instances is set (has been assigned a value) and false otherwise */
  public boolean isSetInstances() {
    return this.instances != null;
  }

  public void setInstancesIsSet(boolean value) {
    if (!value) {
      this.instances = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK:
      if (value == null) {
        unsetTask();
      } else {
        setTask((TaskConfig)value);
      }
      break;

    case INSTANCES:
      if (value == null) {
        unsetInstances();
      } else {
        setInstances((Set<Range>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK:
      return getTask();

    case INSTANCES:
      return getInstances();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK:
      return isSetTask();
    case INSTANCES:
      return isSetInstances();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InstanceTaskConfig)
      return this.equals((InstanceTaskConfig)that);
    return false;
  }

  public boolean equals(InstanceTaskConfig that) {
    if (that == null)
      return false;

    boolean this_present_task = true && this.isSetTask();
    boolean that_present_task = true && that.isSetTask();
    if (this_present_task || that_present_task) {
      if (!(this_present_task && that_present_task))
        return false;
      if (!this.task.equals(that.task))
        return false;
    }

    boolean this_present_instances = true && this.isSetInstances();
    boolean that_present_instances = true && that.isSetInstances();
    if (this_present_instances || that_present_instances) {
      if (!(this_present_instances && that_present_instances))
        return false;
      if (!this.instances.equals(that.instances))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_task = true && (isSetTask());
    list.add(present_task);
    if (present_task)
      list.add(task);

    boolean present_instances = true && (isSetInstances());
    list.add(present_instances);
    if (present_instances)
      list.add(instances);

    return list.hashCode();
  }

  @Override
  public int compareTo(InstanceTaskConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTask()).compareTo(other.isSetTask());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTask()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task, other.task);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstances()).compareTo(other.isSetInstances());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstances()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instances, other.instances);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InstanceTaskConfig(");
    boolean first = true;

    sb.append("task:");
    if (this.task == null) {
      sb.append("null");
    } else {
      sb.append(this.task);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("instances:");
    if (this.instances == null) {
      sb.append("null");
    } else {
      sb.append(this.instances);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (task != null) {
      task.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InstanceTaskConfigStandardSchemeFactory implements SchemeFactory {
    public InstanceTaskConfigStandardScheme getScheme() {
      return new InstanceTaskConfigStandardScheme();
    }
  }

  private static class InstanceTaskConfigStandardScheme extends StandardScheme<InstanceTaskConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InstanceTaskConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.task = new TaskConfig();
              struct.task.read(iprot);
              struct.setTaskIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INSTANCES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set206 = iprot.readSetBegin();
                struct.instances = new HashSet<Range>(2*_set206.size);
                Range _elem207;
                for (int _i208 = 0; _i208 < _set206.size; ++_i208)
                {
                  _elem207 = new Range();
                  _elem207.read(iprot);
                  struct.instances.add(_elem207);
                }
                iprot.readSetEnd();
              }
              struct.setInstancesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, InstanceTaskConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.task != null) {
        oprot.writeFieldBegin(TASK_FIELD_DESC);
        struct.task.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.instances != null) {
        oprot.writeFieldBegin(INSTANCES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.instances.size()));
          for (Range _iter209 : struct.instances)
          {
            _iter209.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InstanceTaskConfigTupleSchemeFactory implements SchemeFactory {
    public InstanceTaskConfigTupleScheme getScheme() {
      return new InstanceTaskConfigTupleScheme();
    }
  }

  private static class InstanceTaskConfigTupleScheme extends TupleScheme<InstanceTaskConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InstanceTaskConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTask()) {
        optionals.set(0);
      }
      if (struct.isSetInstances()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTask()) {
        struct.task.write(oprot);
      }
      if (struct.isSetInstances()) {
        {
          oprot.writeI32(struct.instances.size());
          for (Range _iter210 : struct.instances)
          {
            _iter210.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InstanceTaskConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.task = new TaskConfig();
        struct.task.read(iprot);
        struct.setTaskIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TSet _set211 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.instances = new HashSet<Range>(2*_set211.size);
          Range _elem212;
          for (int _i213 = 0; _i213 < _set211.size; ++_i213)
          {
            _elem212 = new Range();
            _elem212.read(iprot);
            struct.instances.add(_elem212);
          }
        }
        struct.setInstancesIsSet(true);
      }
    }
  }

}

