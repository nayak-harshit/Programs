// this program converts a decimal number to a binary number.
// Author@NAYAK
// First of all we divide the decimal number with 2 
// and store the remainder value in an array
// then we display the array..  
import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int dec = sc.nextInt();

        int i = 0;
        int bin[] = new int[100];

        while(dec>0){
            bin[i++] = dec % 2;// storing the remainder in the array
            dec = Math.floorDiv(dec , 2);// getting the quotient in floor value
            
        }

        System.out.println("The binary conversion is:");
        // printing the array in reverse...
        // length of array to be printed depends on the number of divisions i.e. i 
        for(int j = i-1; j>=0; j--){
            System.out.print(bin[j]);
        }
        

        sc.close();
    }
    
}
