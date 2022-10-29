package com.syntax.class14;

import java.util.Scanner;

public class MethThatReturnValues1 {

    //I want to create a method that returns true or false if a number is even or not. I will take number input from user

    //1. First I create a method with a logic that can can find even numbers
    boolean isEven(int number){
        if(number%2==0){
            return true;
        }  else {
            return false;
        }
    }

    public static void main(String[] args) {

        MethThatReturnValues1 md=new MethThatReturnValues1();

        if(md.isEven(4)){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is odd");
        }

        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
    }
}
