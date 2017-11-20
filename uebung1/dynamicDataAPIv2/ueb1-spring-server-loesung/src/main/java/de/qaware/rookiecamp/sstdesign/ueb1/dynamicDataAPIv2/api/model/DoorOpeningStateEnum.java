package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DoorOpeningStateEnum
 */
public enum DoorOpeningStateEnum {
  
  CLOSED("CLOSED"),
  
  OPEN("OPEN"),
  
  INVALID("INVALID");

  private Object value;

  DoorOpeningStateEnum(Object value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DoorOpeningStateEnum fromValue(String text) {
    for (DoorOpeningStateEnum b : DoorOpeningStateEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

