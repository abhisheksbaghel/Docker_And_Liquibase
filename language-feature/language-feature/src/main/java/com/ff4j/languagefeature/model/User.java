package com.ff4j.languagefeature.model;

import lombok.Data;

@Data
public class User {

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String birthday;
    private String gender;
    private Address address;
    private String website;
    private String image;
}
