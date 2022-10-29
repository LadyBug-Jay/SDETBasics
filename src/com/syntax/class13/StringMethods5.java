package com.syntax.class13;

public class StringMethods5 {
    public static void main(String[] args) {
      String str="hello";
      str.toUpperCase();//Because of string immutability we can not change the string, this does not have a variable. the object which is upper case "HELLO"is created but was not assigned to any variable hence java will not print the upper case
        System.out.println(str);
        System.out.println("-----------------------------");

        str=str.toUpperCase();//Here we have reassigned the variable "str"hence java will be able to print the upper case
        System.out.println(str);










    }
}
