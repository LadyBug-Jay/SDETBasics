package com.syntax.class11.Tasks;

public class Phone {
    String make;
    String model;
    String color;
    int yearOfManufacture;
    int storage;

    // secondly define the behavior or thing it can be used for
    // we can also use the attributes stated when defining the behavior

    void makeCall() {
        System.out.println("Making a call using " + model);
    }

    void takePictures() {
        System.out.println("Taking Pictures using " + model);
    }

    void browseInternet() {
        System.out.println("Browsing using " + model);
    }
}
