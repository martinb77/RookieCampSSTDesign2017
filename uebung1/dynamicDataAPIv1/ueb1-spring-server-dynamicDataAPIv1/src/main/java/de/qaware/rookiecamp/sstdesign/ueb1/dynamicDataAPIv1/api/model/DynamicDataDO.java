package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * DynamicDataDO
 */
public class DynamicDataDO {
    @JsonProperty
    private Map<String, String> attributesMap = null;

    @JsonProperty
    @Valid
    private Map<String, List<VehicleMessageDO>> vehicleMessages = null;

    public DynamicDataDO attributesMap(Map<String, String> attributesMap) {
        this.attributesMap = attributesMap;
        return this;
    }

    public DynamicDataDO putAttributesMapItem(String key, String attributesMapItem) {
        if (this.attributesMap == null) {
            this.attributesMap = new HashMap<>();
        }
        this.attributesMap.put(key, attributesMapItem);
        return this;
    }

    /**
     * Get attributesMap
     *
     * @return attributesMap
     **/
    public Map<String, String> getAttributesMap() {
        return attributesMap;
    }

    public void setAttributesMap(Map<String, String> attributesMap) {
        this.attributesMap = attributesMap;
    }

    public DynamicDataDO vehicleMessages(Map<String, List<VehicleMessageDO>> vehicleMessages) {
        this.vehicleMessages = vehicleMessages;
        return this;
    }

    public DynamicDataDO putVehicleMessagesItem(String key, List<VehicleMessageDO> vehicleMessagesItem) {
        if (this.vehicleMessages == null) {
            this.vehicleMessages = new HashMap<>();
        }
        this.vehicleMessages.put(key, vehicleMessagesItem);
        return this;
    }

    /**
     * Get vehicleMessages
     *
     * @return vehicleMessages
     **/
    public Map<String, List<VehicleMessageDO>> getVehicleMessages() {
        return vehicleMessages;
    }

    public void setVehicleMessages(Map<String, List<VehicleMessageDO>> vehicleMessages) {
        this.vehicleMessages = vehicleMessages;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DynamicDataDO dynamicDataDO = (DynamicDataDO) o;
        return Objects.equals(this.attributesMap, dynamicDataDO.attributesMap) &&
                Objects.equals(this.vehicleMessages, dynamicDataDO.vehicleMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributesMap, vehicleMessages);
    }

    @Override
    public String toString() {

        return "class DynamicDataDO {\n" +
                "    attributesMap: " + toIndentedString(attributesMap) + "\n" +
                "    vehicleMessages: " + toIndentedString(vehicleMessages) + "\n" +
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

