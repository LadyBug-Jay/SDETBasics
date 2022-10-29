package com.syntax.class15;

public class Task2 {

    //If i want to create object for the class "SyntaxEmployee"
    public static void main(String[] args) {
        SyntaxEmployee judithEmp =new SyntaxEmployee();
        judithEmp.empId="123";
        judithEmp.salary=500000;


        System.out.println(SyntaxEmployee.CEO);
        SyntaxEmployee janeEmp =new SyntaxEmployee();
        janeEmp.empId="123";
        janeEmp.salary=600000;

        System.out.println(SyntaxEmployee.CEO);


    }
}
