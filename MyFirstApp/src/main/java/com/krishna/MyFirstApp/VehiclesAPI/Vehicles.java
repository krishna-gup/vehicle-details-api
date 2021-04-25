package com.krishna.MyFirstApp.VehiclesAPI;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicles {

    @Id
    private String registrationNumber;
    private String ownerName;
    private String makeName;
    private double retailValue;
    private boolean insuranceValid;

    public Vehicles() {

    }

    public Vehicles(String ownerName, String registrationNumber, String makeName, double retailValue, boolean insuranceValid) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.makeName = makeName;
        this.retailValue = retailValue;
        this.insuranceValid = insuranceValid;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public double getRetailValue() {
        return retailValue;
    }

    public void setRetailValue(double retailValue) {
        this.retailValue = retailValue;
    }

    public boolean isInsuranceValid() {
        return insuranceValid;
    }

    public void setInsuranceValid(boolean insuranceValid) {
        this.insuranceValid = insuranceValid;
    }

}
