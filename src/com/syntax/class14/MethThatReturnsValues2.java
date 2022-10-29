package com.syntax.class14;

public class MethThatReturnsValues2 {

    boolean mystery(){
        return true;
    }

    String mystery2(int num){//Despite the fact that this parameter is passed however it is not being used
        return "Java";// So this is the logic that will be printed no matter the number called in the object below
    }
    String method(String word){
        //return "Java";
        if(word.equals("Java")){
            return "python";
        }else
        {
            return "Java";
        }

    }
    public static void main(String[] args) {
        MethThatReturnsValues2 methodsDemo4=new MethThatReturnsValues2();
        System.out.println(methodsDemo4.mystery());
        System.out.println(methodsDemo4.mystery2(10));
        System.out.println(methodsDemo4.method("python"));
    }
}
