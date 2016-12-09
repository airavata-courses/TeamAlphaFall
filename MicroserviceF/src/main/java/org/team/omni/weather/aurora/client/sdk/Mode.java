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

/**
 * The mode for a volume mount
 */
public enum Mode implements org.apache.thrift.TEnum {
  /**
   * Read Write
   */
  RW(1),
  /**
   * Read Only
   */
  RO(2);

  private final int value;

  private Mode(int value) {
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
  public static Mode findByValue(int value) { 
    switch (value) {
      case 1:
        return RW;
      case 2:
        return RO;
      default:
        return null;
    }
  }
}
