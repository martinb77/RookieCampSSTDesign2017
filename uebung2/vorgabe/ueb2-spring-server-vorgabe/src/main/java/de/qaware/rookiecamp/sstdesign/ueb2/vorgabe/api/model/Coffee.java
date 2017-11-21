package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

public class Coffee {

    private Integer id;
    private String brand;
    private String imageURI;
    private TimePeriod period;

    public Coffee(Integer id, String brand, String imageURI, TimePeriod period) {
        this.id = id;
        this.brand = brand;
        this.imageURI = imageURI;
        this.period = period;
    }

    public TimePeriod getPeriod() {
        return period;
    }

    public void setPeriod(TimePeriod period) {
        this.period = period;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImageURI() {
        return imageURI;
    }

    public void setImageURI(String imageURI) {
        this.imageURI = imageURI;
    }
}
