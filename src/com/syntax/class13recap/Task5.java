package com.syntax.class13recap;

public class Task5 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true Abbc =>false

        String str="dad";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)) {
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");}

    }
}
