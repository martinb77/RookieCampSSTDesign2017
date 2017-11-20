package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets WindowOpeningStateEnum
 */
public enum WindowOpeningStateEnum {
  
  CLOSED("CLOSED"),
  
  INTERMEDIATE("INTERMEDIATE"),
  
  OPEN("OPEN"),
  
  INVALID("INVALID");

  private String value;

  WindowOpeningStateEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WindowOpeningStateEnum fromValue(String text) {
    for (WindowOpeningStateEnum b : WindowOpeningStateEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

