package com.pranaypangerkar.sbet.webtuts.model;

public class User {
    private String position;
    private double salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User(){
        this.name = "dummy";
        this.position = "worker";
        this.salary = 0;
    }

    public User(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
