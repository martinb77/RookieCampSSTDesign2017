package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

public class Beverage {
    private Integer id;
    private String name;

    public Beverage(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
