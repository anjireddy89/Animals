package com.animals;

public class Bird extends Animal{
    public Bird(String petName, int age, String ownerName) {
        super(petName, age, ownerName, 2);
    }

    public String getAnimalType() {
        return "Bird";
    }
}
