package com.animals;

public class Dog extends Animal{

    public Dog(String petName, int age, String ownerName) {
        super(petName, age, ownerName, 4);
    }
    public String getAnimalType() {
        return "Dog";
    }
}
