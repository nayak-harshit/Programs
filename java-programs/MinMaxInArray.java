/* This is a program to find the minimum or maximum value of an 
   integer array. 
*/
import java.util.Scanner;
public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number of elements:");
        int length = scan.nextInt();
       int []array = new int[length];
       System.out.println("Enter the  elements:");

       for(int i=0; i<length; i++)  
       {  
          //reading array elements from the user   
            array[i]=scan.nextInt();  
        } 

     System.out.print("0.MAX \n 1.MIN \n");
     int chose = scan.nextInt(2);
     int max = Integer.MIN_VALUE;
     int min = Integer.MAX_VALUE;

     if (chose == 0 ){
         for (int i = 0; i < array.length; i++) {
             if (max < array[i]) {
                 max = array[i];
             }
            }
            System.out.println("Maximum value in array is :" +max);
     } else {
         for (int j= 0; j < array.length; j++) {
             if (min > array[j]) {
                 min = array[j];
             }
             
            } 
            System.out.println("Minimum value in array is :" +min);
     }
     scan.close();
    }
}
