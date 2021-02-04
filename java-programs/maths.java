
import java.util.Scanner;

/*
This program will do the following for 2 integers:
1. Sum
2. Subtract
3. Multiply
4. Divide
5. H.C.F.
6. L.C.M.
 */
class sum{
    sum(int a, int b){
        System.out.println("The Sum of the numbers is:"+(a+b));
    }
}

class Subtract extends sum{
    Subtract(int q, int w){// a constructor
        super(q, w); // this tells the parent class to use these as parameters
        System.out.println("The Subtraction of the numbers is:"+(q-w));
    }
}

class Multiplication extends Subtract{
    Multiplication(int q, int w){
        super(q, w);
        System.out.println("The Multiplication of the numbers is:"+(q*w));
    }
}

class Divide extends Multiplication{
    Divide(int q, int w){
        super(q, w);
        System.out.println("The division of the numbers is:"+(q/w));
    }
}

class HCF extends Divide{
    HCF(int q, int w){
        super(q, w);
        int n1 = q, n2 = w, gcd = 1;
    
            for(int i = 1; i <= n1 && i <= n2; ++i)
            {
                // Checks if i is factor of both integers
                if(n1 % i==0 && n2 % i==0)
                    gcd = i;
            }
            System.out.println("The HCF of the numbers is:" +gcd);
            System.out.println("The LCM of the numbers is:" + (q*w)/gcd);
        }
}

public class maths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("This program will do the following with 2 numbers: \n 1. sum");
            System.out.println("2.Subtraction \n 3. Multiplication \n 4. Division \n 5. HCF \n 6. LCM ");
        System.out.println("Enter the first number:");
            int a = scan.nextInt();
        System.out.println("Enter the second number:");
            int b = scan.nextInt();
        HCF math = new HCF(a,b);
    }
    
}

