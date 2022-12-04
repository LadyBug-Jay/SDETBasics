package com.syntax.class11.Tasks;

public class MobileDevice {
    String make;
    String model;
    String color;
    int storage;
    int yearOfManufacture;
    double size;
    boolean cheap;

    void call() {
        System.out.println("The call feature on "+model+ " is top notch" );
    }

    void takePicture() {
        System.out.println("Taking pictures is amazing using " + make);
    }

    public static void main(String[] args) {
        // Name of Class variable name = new Name of class ();
        MobileDevice iphone = new MobileDevice();
        iphone.make = "Apple";
        iphone.model = "Iphone 14 Pro Max";
        iphone.color = "Black";
        iphone.storage = 128;
        iphone.size = 6.8;
        iphone.cheap = false;
        iphone.takePicture();
        iphone.call();

        System.out.println("*****************");

        MobileDevice samsungPhone = new MobileDevice();
        samsungPhone.make = "Samsung";
        samsungPhone.model = "Galaxy S22 Ultra";
        samsungPhone.color = "Grey";
        samsungPhone.storage = 256;
        samsungPhone.size = 6.7;
        samsungPhone.cheap = false;
        samsungPhone.takePicture();
        samsungPhone.call();

        System.out.println("*****************");

        MobileDevice pixel = new MobileDevice();
        pixel.make = "Google";
        pixel.model = "pixel 6 pro";
        pixel.color = "White";
        pixel.storage = 256;
        pixel.size = 6.7;
        pixel.cheap = false;
        pixel.takePicture();
        pixel.call();

    }

}
