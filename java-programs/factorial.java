/*  This program will find the factorial of a given number.
    In this program I'm making a method to find the factorial of a number,
    and then calling it in my main method... 
*/

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to find factorial of:");  
      int n = sc.nextInt();
      System.out.printf("The Factorial of %d is: %d \n ", n , fac(n));

    }
          static int fac(int n){ // method to find the factorial of a number
            if(n<0){// actually this is not defined...
                return 0; // I don't get any better return type, so It is 0
            }
            else if (n == 0 || n ==1 ){
                 return 1;// Factorial of 0 and 1 both is 1
             }   
             else{
                return n* fac(n-1);//  I'm using the recursion here
             }
          }
    
}
