package com.example.model;

public class User {

    private String name;
    private String department;

    public User() {
    }

    public User(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return department;
    }

    public void setDept(String department) {
        this.department = department;
    }
}
