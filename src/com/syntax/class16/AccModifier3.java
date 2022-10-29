package com.syntax.class16;

public class AccModifier3 {
    //Create the maxLength method that will accept String array of words and return the word with the largest length.
    //Method should be visible only within same package!
    //**Expected Output:**
    //this is long

    static String maxLength(String[] words){
        String word=words[0];
        for(String arr:words){
            if(arr.length() > word.length()){
                word=arr;
            }
        }
        return word;
    }


    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }












}
