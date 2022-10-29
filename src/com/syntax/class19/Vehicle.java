package com.syntax.class19;

public class Vehicle {
    //Write program for multilevel inheritance where class C inherits from class B and Class B
    // inherits from Class A.

    String name;
    int year;
    int maxspeed;

    Vehicle(String name, int year, int maxspeed){
        this.name=name;
        this.year=year;
        this.maxspeed=maxspeed;

    }void printInfo(){
        System.out.println("name"+name+"year"+year+"maxspeed");
    }















}
