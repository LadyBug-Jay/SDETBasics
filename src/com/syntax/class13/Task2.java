package com.syntax.class13;

public class Task2 {
    public static void main(String[] args) {
        /*
         * Create a String and print it in reverse order (Sunday → yadnuS).
         */

        String str="Sunday";
        //write a reverse loop
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //Another way will be to first convert the variable "str"to an array of characters
        char [] charArr=str.toCharArray();
        //Write a reverse loop
        for(int i=charArr.length-1;i>=0;i--) {
            System.out.print(charArr[i]);
        }



    }
}
