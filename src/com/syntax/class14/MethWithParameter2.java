package com.syntax.class14;

public class MethWithParameter2 {

    /*
    A Method that takes a single parameter of type String and prints it
     */
    void printWord(String word) {
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethWithParameter2 obj = new MethWithParameter2 ();
        obj.printWord("Taivion Don't worry its Java");
        obj.printWord("No Athira it does not make sense i am confused can you please repeat it");

    }
}
