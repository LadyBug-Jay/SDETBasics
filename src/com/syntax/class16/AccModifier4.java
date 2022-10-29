package com.syntax.class16;

public class AccModifier4 {
//Create the maxValue method that will accept int array and return return the maximum value in the array.
//Method should be visible every class in any package!
//**Expected Output:**
//22

    static int maxValue(int[] arr){
        //Initialize maximum element
        int max=arr[0];//5

        //Traverse array elements from the index 1
        //and compare every element with the current max
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }


}
