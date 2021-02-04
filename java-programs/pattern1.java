/*
 Write a program using functions to print the following pattern:(using Recursion also)
 *
 **
 ***
 ****
*/
import java.util.Scanner;
public class pattern1 {
    static void ptrn(int x) {
      for (int i = 0; i < x; i++) {
       if (x >0){
        for (int j = 0; j < i+1; j++) {
          
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the number of lines:");
     int line = scan.nextInt();
     ptrn(line);
  }   
} 
