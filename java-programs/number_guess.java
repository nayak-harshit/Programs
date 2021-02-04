import java.util.Random;
import java.util.Scanner;
/* INSTRUCTIONS:-
This is a simple game to guess the random number generated by 
the computer, by using the instructions given by the computer
on your first guess. 
You have maximum 10 chances.
Highest score is 10 , when you guess at your first chance.
If you cannot guess after 10 chances, you loose.  
*/
/* ALGORITHM :-
    1. Generate a random number.(b|w 0 to 99)
    2. Take input of user's number.
    3. Compare the user's number with the random number.
    4. Tell the user if the number is correct 
    5. Else tell either the number is smaller or greater.
    6. If the number is wrong start from step 3.
    7. Only 10 chances are given.
*/
// author@NAYAK
public class number_guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int comp = rand.nextInt(100); //the number which the user has to guess.
        Scanner scan = new Scanner(System.in);
        int score = 10;
        int match = 1;
        System.out.println("Highest Score: 10");
        do {
            System.out.println("MATCH: " +match);
            System.out.println("Guess any number from 0 to 99:");
            int guess = scan.nextInt();
            if (guess == comp) {
                System.out.println("YOU GUSSED THE CORRECT NUMBER. \n SCORE: " +score);
                break;
            } 
            else if( guess > comp){
                System.out.println("You gussed a larger number \n TRY AGAIN " );
                match++; score--;
            }
            else {
                System.out.println("You gussed a smaller number \n TRY AGAIN " );
                match++; score--;
            }

        } while (match <11);
        if (match == 11) System.out.println("You cannot guess the number \n YOU LOST \n The number was: "+comp);

      scan.close();  
    }
    
}
