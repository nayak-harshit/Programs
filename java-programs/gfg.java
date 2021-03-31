/*
// Java Program to swap the two values
// without using third variable

// Importing generic Java libraries
import java.util.*;

class gfg {

    // Function to swap valus of two numbers
    // without creaing temp variable
    static void swapValuesWithoutUsingThirdVariable(int m,
                                                    int n)
    {
        // Steps as listed in algorithm

        // Difference of 2nd from 1st
        // is stored in first variable
        m = m - n;

        // Sum is stored in second variable
        n = m + n;

        // Difference of 1st from 2nd
        // is replaced in first variable
        m = n - m;

        // Print numbers
        System.out.println("Value of m is " + m
                + " and Value of n is " + n);
    }

    public static void SwapNumbers(int a1, int b1) {
        int temp = a1;
        a1 = b1;
        b1 = temp;
    }

    public static void selecctionsort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int maxindex = 0;

            for (int j = 0; j <i ; j++) {
                if(arr[maxindex] <=arr[j]){
                    maxindex =j;
                    SwapNumbers(arr[j] , arr[]);
                }
            }
        }
    }
    // Main driver method
    public static void main(String[] args)
    {
        // Random numbers of integer type
        int m = 9, n = 5;

        // Above function is called in main
        // to print swapped values of numbers
*/
/*        swapValuesWithoutUsingThirdVariable(m, n);*//*


        int[] a = new int[]{1, 2, 3};
        selecctionsort(a);
        for (int i :a ) {
            System.out.println(i);
        }
    }
}
*/
