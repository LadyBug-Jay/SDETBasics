package com.syntax.class14recap;

import java.util.Scanner;

public class Task1UsingScanner {

    //Create a method that will take 2 parameters as a numbers and prints which number is larger. Take input from user


    void printLarger(int num1, int num2){
        if(num1>num2){
            System.out.println("a is the larger number "+num1);
        }else if(num2>num1){
            System.out.println("b is the larger number "+num2);
        }else{
            System.out.println("Numbers are equal");
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please Enter the second number");
        int num2 = scanner.nextInt();

        Task1 task1 = new Task1();
        task1.printLarger(num1, num2);



    }
}
