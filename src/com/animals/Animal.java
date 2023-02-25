package com.animals;

public abstract class Animal {

    private String petName;
    private int age;
    private String ownerName;
    private int numLegs;

    public Animal(String petName, int age, String ownerName, int numLegs) {
        this.petName = petName;
        this.age = age;
        this.ownerName = ownerName;
        this.numLegs = numLegs;
    }

    public String getPetName() {
        return petName;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public abstract String getAnimalType();

    public String toString() {
        return getAnimalType() + " named " + petName + ", " + age + " years old, owned by " + ownerName + ", with " + numLegs + " legs";
    }
}
