package com.animals;

public class AnimalFactory {
    public static Animal createAnimal(String animalType,String ownerName , int age,String petName) {
        switch (animalType) {
            case "Dog":
                return new Dog(petName, age, ownerName);
            case "Cat":
                return new Cat(petName, age, ownerName);
            case "Bird":
                return new Bird(petName, age, ownerName);
            case "Snake":
                return new Snake(petName, age, ownerName);
            default:
                throw new IllegalArgumentException("Invalid animal type: " + animalType);
        }
    }
}
