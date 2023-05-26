package com.ff4j.languagefeature.model;

import lombok.Data;

@Data
public class Address {

    private int id;
    private String street;
    private String streetName;
    private String buildingNumber;
    private String city;
    private String zipcode;
    private String country;
    private String county_code;
    private double latitude;
    private double longitude;
}
