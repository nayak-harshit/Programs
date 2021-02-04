import java.util.Scanner;

// this program will tell weather a number is prime or not
public class prime_number {

public static void main(String[] args) {
    int k;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number to check prime or not:");
    k = scan.nextInt();
    System.out.println(prime(k));

}

    static boolean prime(int p){
       if(p == 1 ){
           System.out.println("not prime nor composite");
           return false;
       }
       else if(p == 2){
           return true;
       }
       else if(p<0){
           System.out.println("Negative not compatible...");
           return false;
       }
       else{
           for (int i = 2; i < p; i++) {
               if(p %i == 0){                   
                   return false;  
               }              
           }
           return true;
       }
    }
}
