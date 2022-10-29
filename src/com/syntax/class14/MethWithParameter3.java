package com.syntax.class14;

public class MethWithParameter3 {

    void printManyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello Java");
        }
    }


    /* in Methods with Parameters sequence and data type matters just as they have been specified in the parenthesis */

    void printCustomWordManyTimes(String word,int times){

        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        MethWithParameter3 md=new MethWithParameter3();
        md.printManyTimes(5);
        System.out.println("----------------");

        md.printCustomWordManyTimes("Syntax Easy",2);
    }


}
