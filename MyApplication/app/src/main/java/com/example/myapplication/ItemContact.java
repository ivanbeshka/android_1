package com.example.myapplication;

public class ItemContact {

    private String name;
    private String surname;

    public ItemContact (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
