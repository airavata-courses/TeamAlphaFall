/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.team.omni.weather.aurora.client.sdk;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum MaintenanceMode implements org.apache.thrift.TEnum {
  NONE(1),
  SCHEDULED(2),
  DRAINING(3),
  DRAINED(4);

  private final int value;

  private MaintenanceMode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MaintenanceMode findByValue(int value) { 
    switch (value) {
      case 1:
        return NONE;
      case 2:
        return SCHEDULED;
      case 3:
        return DRAINING;
      case 4:
        return DRAINED;
      default:
        return null;
    }
  }
}
