package org.example.day5Abtract.HomeWork5.Ex1;

public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void area();
}
