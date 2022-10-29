package com.syntax.class13;

import java.util.Arrays;

public class StringMethods4 {
    public static void main(String[] args) {

// if I want to get an array that stores each word in a string in indexes
        //method split: this can split based on what we want

        String str="Batch 14 is really good";
        String [] arr=str.split(" ");// here we are saying split based on space
       //String [] arr=str.split("[t]");// here we are saying split based on the letter t

        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------");

       System.out.println(arr[4]);

        System.out.println("----------------------------------");

        String str2="Today is Sunday. Sunday is good. Java is also good";
        String[] arr2=str2.split("[.]");//here we are saying split based on the full stop. Note that the split method take a regular expression.
        // so we use a square bracket whenever we want to pass an individual character or a symbol
        System.out.println(Arrays.toString(arr2));














    }
}
