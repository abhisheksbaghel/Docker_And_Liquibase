package com.learn_dbmigration.liquibase_practice.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "person_table")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int person_id;

    private float height;

    private float weight;

    private String lastName;

    private String address;

    private String name;

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public float getHeight() {
        return height;
    }

    public String getAddress() {
        return address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
