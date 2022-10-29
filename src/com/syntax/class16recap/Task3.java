package com.syntax.class16recap;

public class Task3 {
      /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    private static String getVowels(String str){
     /*   String newStr=str.replaceAll("[^aeiouAEIOU]","");
        return newStr;*/

        return str.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        System.out.println(getVowels("Humera"));

        System.out.println(".........Another way......................");
        String humera = getVowels("Humera");
       System.out.println("humera = " + humera);

    }





}
