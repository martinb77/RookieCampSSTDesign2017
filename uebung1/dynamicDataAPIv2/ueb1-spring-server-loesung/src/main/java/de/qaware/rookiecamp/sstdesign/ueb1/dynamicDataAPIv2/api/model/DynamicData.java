package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

/**
 * dynamic data of the given vehicle - empty if no data available
 */
@ApiModel(description = "dynamic data of the given vehicle - empty if no data available")
public class DynamicData {
  @JsonProperty
  @Valid
  @ApiModelProperty("Update information for this dynamic data.")
  private UpateInformation updateInformation;

  @JsonProperty
  @Valid
  @ApiModelProperty("All data for the vehicle state, except opening state.")
  private VehicleState vehicleState;

  @JsonProperty
  @Valid
  @ApiModelProperty("Opening/closing state of the vehicle.")
  private OpeningState openingState;

  @JsonProperty
  @Valid
  @ApiModelProperty("Check-Control Messages for the vehicle.")
  private List<VehicleMessage> ccmMessages;

  @JsonProperty
  @Valid
  @ApiModelProperty("Condition Based Services - Messages for the vehicle.")
  private List<VehicleMessage> cbsMessages;

  public DynamicData updateInformation(UpateInformation updateInformation) {
    this.updateInformation = updateInformation;
    return this;
  }

   /**
   * Get updateInformation
   * @return updateInformation
  **/
  public UpateInformation getUpdateInformation() {
    return updateInformation;
  }

  public void setUpdateInformation(UpateInformation updateInformation) {
    this.updateInformation = updateInformation;
  }

  public DynamicData vehicleState(VehicleState vehicleState) {
    this.vehicleState = vehicleState;
    return this;
  }

   /**
   * Get vehicleState
   * @return vehicleState
  **/
  public VehicleState getVehicleState() {
    return vehicleState;
  }

  public void setVehicleState(VehicleState vehicleState) {
    this.vehicleState = vehicleState;
  }

  public DynamicData openingState(OpeningState openingState) {
    this.openingState = openingState;
    return this;
  }

   /**
   * Get openingState
   * @return openingState
  **/
  public OpeningState getOpeningState() {
    return openingState;
  }

  public void setOpeningState(OpeningState openingState) {
    this.openingState = openingState;
  }

  public DynamicData ccmMessages(List<VehicleMessage> ccmMessages) {
    this.ccmMessages = ccmMessages;
    return this;
  }

  public DynamicData addCcmMessagesItem(VehicleMessage ccmMessagesItem) {
    if (this.ccmMessages == null) {
      this.ccmMessages = new ArrayList<>();
    }
    this.ccmMessages.add(ccmMessagesItem);
    return this;
  }

   /**
   * Get ccmMessages
   * @return ccmMessages
  **/
  public List<VehicleMessage> getCcmMessages() {
    return ccmMessages;
  }

  public void setCcmMessages(List<VehicleMessage> ccmMessages) {
    this.ccmMessages = ccmMessages;
  }

  public DynamicData cbsMessages(List<VehicleMessage> cbsMessages) {
    this.cbsMessages = cbsMessages;
    return this;
  }

  public DynamicData addCbsMessagesItem(VehicleMessage cbsMessagesItem) {
    if (this.cbsMessages == null) {
      this.cbsMessages = new ArrayList<>();
    }
    this.cbsMessages.add(cbsMessagesItem);
    return this;
  }

   /**
   * Get cbsMessages
   * @return cbsMessages
  **/
  public List<VehicleMessage> getCbsMessages() {
    return cbsMessages;
  }

  public void setCbsMessages(List<VehicleMessage> cbsMessages) {
    this.cbsMessages = cbsMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicData dynamicData = (DynamicData) o;
    return Objects.equals(this.updateInformation, dynamicData.updateInformation) &&
        Objects.equals(this.vehicleState, dynamicData.vehicleState) &&
        Objects.equals(this.openingState, dynamicData.openingState) &&
        Objects.equals(this.ccmMessages, dynamicData.ccmMessages) &&
        Objects.equals(this.cbsMessages, dynamicData.cbsMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateInformation, vehicleState, openingState, ccmMessages, cbsMessages);
  }

  @Override
  public String toString() {

    return "class DynamicData {\n" +
            "    updateInformation: " + toIndentedString(updateInformation) + "\n" +
            "    vehicleState: " + toIndentedString(vehicleState) + "\n" +
            "    openingState: " + toIndentedString(openingState) + "\n" +
            "    ccmMessages: " + toIndentedString(ccmMessages) + "\n" +
            "    cbsMessages: " + toIndentedString(cbsMessages) + "\n" +
            "}";
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

