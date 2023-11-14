package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min = 3, max = 150)
    private String location;
    public Employer() {
    }

//    add public methods

    public String getLocation() {return this.location;}

    public void setLocation(String location) {
        this.location = location;
    }
}
