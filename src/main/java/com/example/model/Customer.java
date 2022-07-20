package com.example.model;

import java.io.Serializable;

public class Customer implements Serializable{

    private String id;
    private String name;
    private boolean isValid;

    public Customer() {
    }

    public Customer(String id, String name, boolean isValid) {
        this.id = id;
        this.name = name;
        this.isValid = isValid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }
}
