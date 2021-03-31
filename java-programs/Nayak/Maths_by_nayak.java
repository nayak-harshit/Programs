package Nayak;

import java.util.Arrays;

public class Maths_by_nayak {
    /**
     * @param number
     * @param power  This method returns the exponent of of a number
     */
    public double Power(double number, double power) {
        if (power == 0) return 1;
       /*if(power>0){
        for (int i = 0; i < power; i++) {
            number = number * number;
        }
        return number;
       }*/
        return Math.pow(number, power);
    }

    /**
     * @param arr of a number to add
     *            This method returns the sum of an array..
     */
    public int SumOfNumbers(int[] arr) {
        return Arrays.stream(arr).sum();
    }


    public int hcf(int a, int b) {
        if (a == b) return a;
        int h = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                h = i;
            }
        }
        return h;
    }

    public int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static void swapNumbers(int a1, int b1) {
        int temp = a1;
        a1 = b1;
        b1 = temp;
    }

    /*public int[] reverseArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {

        }

    }*/
    public static void bubblesort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            boolean issorted = true;
            for (int j = 0; j < i; j++) {
                if (arrays[i] > arrays[i + 1]) {
                    swapNumbers(arrays[i], arrays[i + 1]);
                    issorted = false;
                }
                if (issorted) break;
            }

        }
    }

    public void selecctionsort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int maxindex = 0;

            for (int j = 0; j <i ; j++) {
                if(arr[maxindex] <=arr[j]){
                    maxindex =j;
                    swapNumbers(arr[j] , arr[maxindex]);
                }
            }
        }
    }




}