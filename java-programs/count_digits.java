
/* This program counts the number of digits in a given number
Author@NAYAK
Logic:-
Take input
Divide the given number by 10 
And again divide the previous quotient by 10
Repeat this until quotient is 0
and count the number of divides...
*/
import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number to count the digits:");
     int num = sc.nextInt();
      int c = 0;
      int q = num;
      while (q > 0) { 
        q = Math.floorDiv(q, 10);
        c++;
      }
        System.out.printf("Number of digits in %d is %d", num, c);
     sc.close();  
    }
}
