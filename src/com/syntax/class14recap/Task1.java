package com.syntax.class14recap;

public class Task1 {
//Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void printLarger(int a, int b){
        if(a>b){
            System.out.println("a is the larger number "+a);
        }else if(b>a){
            System.out.println("b is the larger number "+b);
        }else{
            System.out.println("Numbers are equal");
        }
    }


    public static void main(String[] args) {
        Task1 task1=new Task1();
        task1.printLarger(12,38);
        task1.printLarger(71,50);





    }
}
