// This is a very simple 'Test your Luck' Game.
// Whenever you want to test your luck just type yes.
// The program generates three random numbers
// If your all three digits are same then you are lucky,
// Else you could try again, Until you get lucky.

import java.util.Random;
import java.util.Scanner;
// Author@ NAYAK
 class Luck{
    Luck(){
        Random r = new Random();
        // generating three random numbers from 0 to 9
        int one = r.nextInt(10);
        int two = r.nextInt(10);
        int three = r.nextInt(10);
        // printing the three numbres:
        System.out.printf("Your Three numbers are \n %d %d %d \n " ,one ,two, three);
        // comaring the numbers
        if (one == two && two == three){// if all are same you are very lucky
            System.out.println("You are very Lucky Today");
        }
        else if (one == two ||two == three || one == three){ //if any two of them are equal
            System.out.println("You are a little Lucky Today");
        }
        else{ // this is your unluck
            System.out.println("It seems you are not Lucky enough Today");
        }
    }
}

class Test_your_Luck{
    public static void main(String[] args) {
        boolean choice = true;
       Scanner sc = new Scanner(System.in);

        do {
            System.out.println("TEST YOUR LUCK HERE:");
            Luck l = new Luck();
            System.out.println("Do you want to try again!??(true or false)");
            choice = sc.nextBoolean();
        }while (choice == true);

        sc.close();
    }
}