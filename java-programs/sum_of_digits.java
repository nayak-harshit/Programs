// This program will add the digits in a number...
// Author@NAYAK
import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to add the digits of:");
       int d = sc.nextInt();
       int r = 0;
       int q = d;

       while (q >0) {

           // when we divide by 10 the remainder is the last digit of the number..
           r = r + (q % 10);
           q = Math.floorDiv(q, 10);
           
       }

       System.out.printf("The sum of digits of %d is: %d", d, r);
        sc.close();
    }
    
}
