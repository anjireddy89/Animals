package com.animals;

import java.util.Random;

public class Cat extends Animal{
    private int lives;

    public Cat(String petName, int age, String ownerName) {
        super(petName, age, ownerName, 4);
        Random rand = new Random();
        lives = rand.nextInt(9) + 1;
    }

    public int getLives() {
        return lives;
    }

    public String getAnimalType() {
        return "Cat";
    }

    public String toString() {
        return super.toString() + ", with " + lives + " lives left";
    }
}
