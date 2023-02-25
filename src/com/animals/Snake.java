package com.animals;

public class Snake extends Animal{
    public Snake(String petName, int age, String ownerName) {
        super(petName, age, ownerName, 0);
    }
    public String getAnimalType() {
        return "Snake";
    }
}
