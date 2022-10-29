package com.syntax.class16;

public class AccModifier1 {
    //In AccModifier1 Class declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.
    //All methods should be accessible by class name
    //Call methods of AccModifier1 class inside Main class

    static String printDefault(){
        return "default";
    }
    protected static String printProtected(){
        return "protected";
    }
    public static String printPublic(){
        return "public";
    }
}

class Main {
    public static void main(String[]args){

        System.out.println(AccModifier1.printDefault());
        System.out.println(AccModifier1.printProtected());
        System.out.println(AccModifier1.printPublic());
    }




}
