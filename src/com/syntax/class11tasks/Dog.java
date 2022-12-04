package com.syntax.class11tasks;

public class Dog {
    //Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.

    // State
    // attributes/ properties/ fields

    String color;
    String breed;
    String gender;
    int age;

    // These are the behaviors of a dog
    // Methods functions
    void bark() {
        System.out.println("They bark loudly");
    }

    void aggression() {
        System.out.println("They are agressive");
    }

    void personality() {
        System.out.println("They are friendly");
    }
    public static void main(String[] args) {
        // creating objects from a class
        // new Dog();=> it creates an object of class Dog
        Dog husky = new Dog();
        // calling a behavior on an object
        husky.color="Black";
        husky.breed="Siberian";
        husky.gender="Male";
        System.out.println(husky.breed+ " are well trained dogs");
        husky.bark();

        System.out.println("--------------------------------------------------------");


        Dog bulldog = new Dog();
        // calling a behavior on an object
        bulldog.color="Brown";
        bulldog.breed="English bulldog";
        bulldog.gender="Male";
        System.out.println("Bull dogs of breed; " + bulldog.breed+" and gender "+ bulldog.gender+", "+ "are used for guarding.");
        bulldog.aggression();

        System.out.println("--------------------------------------------------------");


        Dog labrador = new Dog();
        // calling a behavior on an object
        labrador.color="Brown";
        labrador.breed="Golden Retriever";
        labrador.gender="Female";
        System.out.println(labrador.gender + " "+labrador.breed+ " are used as guide dogs.");
        labrador.personality();








    }
}
