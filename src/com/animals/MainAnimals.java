package com.animals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainAnimals {
    public static void main(String[] args) {
        String animaltype;
        String ownername;
        int age;
        String petname;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the animaltype,ownername, age, petname");
        animaltype= sc.next();
        ownername= sc.next();
        age= sc.nextInt();
        petname= sc.next();

        //Calling A factory function to get the animals list, created sub clasess  Dog, Cat, snake and Bird by extending  mainclass Animal and also returns Cats lives setting randomly to 1 to 9.
         List<Animal> animals=getAnimals(animaltype,ownername,age,petname);

        //Iterate through the collection and display all animals showing type, owner’s name, pet’s name, age and number of legs. For Cats, show number of lives.
        System.out.println(" Printing All animals showing type, owner’s name, pet’s name, age and number of legs: ");
        animals.stream().forEach((k)->{System.out.println(k);});
        System.out.println("-------------------------------");

        //Sort the collection by owner name and display again.
        System.out.println(" Printing sorted animals list by owner name by ascending order:  ");
       List<Animal> sortByOwnerNameList=animals.stream().sorted(Comparator.comparing(Animal::getOwnerName)).collect(Collectors.toList());
        sortByOwnerNameList.stream().forEach((k)->{System.out.println(k);});
        System.out.println("-------------------------------");

        //Iterate through the collections again but show only Birds.
        System.out.println(" Printing birds list only: ");
        List<Animal> birdsList=animals.stream().filter(s->s.getAnimalType().equalsIgnoreCase("Bird")).collect(Collectors.toList());
        birdsList.stream().forEach((k)->{System.out.println(k);});
        System.out.println("-------------------------------");

        //Iterate through the collections again but show only animals aged 5+ years.
        System.out.println(" Printing animals  5+ list only: ");
        List<Animal> showAge=animals.stream().filter(s->s.getAge()>=5).collect(Collectors.toList());
        showAge.stream().forEach((k)->{System.out.println(k);});

    }

    private static List<Animal> getAnimals(String animaltype, String ownername, int age, String petname) {
        List<Animal> animalList=new ArrayList<Animal>();

        Animal animal = AnimalFactory.createAnimal(animaltype, ownername,age, petname);
        animalList.add(animal);

        // Below Code Used For local test cases

//            Animal dog = AnimalFactory.createAnimal("Dog", "John Smith", 7, "Fido");
//            Animal cat = AnimalFactory.createAnimal("Cat", "John Doe", 12, "Fluffy");
//            Animal bird = AnimalFactory.createAnimal("Bird", "John Doe", 3, "Jonathon Livingston");
//            Animal snake = AnimalFactory.createAnimal("Snake", "Jack Sack", 1, "Slitherer");
//            Animal tonyDog = AnimalFactory.createAnimal("Dog", "Khasim", 25, "tony");
//            Animal sonyCat = AnimalFactory.createAnimal("Cat", "Guttikond", 25, "sony");
//            Animal naniBird = AnimalFactory.createAnimal("Bird", "Veeranji", 32, "Nani");
//            Animal bittusnake = AnimalFactory.createAnimal("Snake", "Anji", 25, "Bittu");
//            animalList.add(dog);
//            animalList.add(cat);
//            animalList.add(bird);
//            animalList.add(snake);
//            animalList.add(naniBird);
//            animalList.add(bittusnake);
//            animalList.add(tonyDog);
//            animalList.add(sonyCat);

        return animalList;
    }
}
