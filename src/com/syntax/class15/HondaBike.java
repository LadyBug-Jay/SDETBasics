package com.syntax.class15;

public class HondaBike {
    static int topSpeed=200;//Static variable
    static int noOfTyres=2;//Static variable
    String model;//Instance variable
    int year;//Instance variable

    void printTotalDistance(int noOfGallons,int avg ){
        double distance=noOfGallons/10;
        System.out.println("Your bike can go max "+distance+
                " with this much "+noOfGallons);
    }

    public static void main(String[] args) {
        System.out.println(HondaBike.noOfTyres);
        HondaBike ybr=new HondaBike();
        ybr.model="ybr100";
        ybr.printTotalDistance(10,20);
    }
}
