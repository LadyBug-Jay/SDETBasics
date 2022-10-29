package com.syntax.class13;

public class StrBuilderStrBuffer {
    public static void main(String[] args) {

        //StringBuilder allows any method to change the original contents of the variables because stringBuilder is mutable
        StringBuilder stringBuilder=new StringBuilder("Intellij is great");
        System.out.println(stringBuilder);

        //As we have methods in the String class, we also have the methods in the StringBuilder class
         // Method: Reverse method

        stringBuilder.reverse();// Any method that is called on the string builder can change the content of the original variable
        System.out.println(stringBuilder);

        System.out.println("--------------------------------------");

//String does not allow any method to change the value of the original variable because string is immutable
        String str= "INTELLIJ";
        str.toLowerCase();
        System.out.println(str);//Prints the value of str still in upperCase




    }
}
