package com.syntax.class14recap;

public class Task4UsingIfElse {

    void sayHello(String country){

        if (country.equals("USA")) {
            System.out.println("Hello");
        }else if(country.equals("India")) {
                System.out.println("Namaste");
           } else if(country.equals("Turkiye")) {
                System.out.println("Merhaba");
            } else if(country.equals("Pakistan")) {
                System.out.println("AOA");
            }else if(country.equals("Japan")) {
                System.out.println("Nihau");
            }else{
                System.out.println("Country not supported");
            }

        }

    public static void main(String[] args) {
        Task4UsingIfElse task4 = new Task4UsingIfElse();
        task4.sayHello("USA");
        task4.sayHello("Turkiye");
    }
}
