package com.syntax.class16;

public class AccModifier2 {
    //In main class please declared the variables using different access modifiers that will hold value for:
    //- name
    //- city
    //- name of the school
    //- batch number

    //Create a method to display details in following format:
    //My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
    //Assign values to the variables and execute method display
    //**Expected Output:**
    //My name is John and I live in Miami. I study at Syntax in batch 9

    public String name;
    String city;
    private String schoolName;
    protected String batchNumber;

    public void printDetails(){
        System.out.println("My name is "+name+ " and I live in "+city+"." +" I study at "+schoolName+ " in "+batchNumber);
    }


    public static void main(String[]args){

        AccModifier2 describe=new AccModifier2();
        describe.name="John";
        describe.city="Miami";
        describe.schoolName="Syntax";
        describe.batchNumber="batch 9";
        describe.printDetails();

    }












}
