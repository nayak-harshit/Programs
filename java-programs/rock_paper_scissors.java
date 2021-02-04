// author@ NAYAK
// Just a game to play rock-paper-scossor with computer by
//generating random numbers as computer's chance and 
// player will input his turn.
// THIS IS A SERIES OF FIVE MATCHES.
import java.util.Random;
import java.util.Scanner;


public class rock_paper_scissors {
    public static void main(String[] args)
     {
         // for generating random numbers
      Random rand  = new Random();
     Scanner scan = new Scanner(System.in);  
     int match = 1;
     // counts the score of the match.
     int scorec ; 
     int scorep ;
     // scorec for computer
     //scorep for player
         // do loop for executing the program 5 times.
         do     
         {
             
             // 'a' is the turn of computer.
             // 'b' is the turn of player.
         int a = rand.nextInt(3);
          System.out.println("MATCH:" +match);
          // printing the instructions.
         System.out.println("0. Rock");
         System.out.println("1. Paper");
         System.out.println("2. Scissors");
         // taking user's turn.
         int b = scan.nextInt(3);
         System.out.println("Your turn:" +b);
         System.out.println("My turn:"+a);
         
         scorec = 0;
          scorep = 0;
         switch (a) {
             case 0:
                 if (b == 1) {
                     System.out.println("YOU WIN");
                     System.out.println("_________");
                     scorep++;
                 }
                 else if (b == 2) {
                     System.out.println("YOU LOSE");
                     System.out.println("_________");
                     scorec++;
                 } else {
                     System.out.println("MATCH DRAW");
                     System.out.println("_________");
                 }

                 break;
            case 1:
                if (b == 2) {
                    System.out.println("YOU WON");
                    System.out.println("_________");
                    scorep++;
                } else if( b == 0) {
                    System.out.println("YOU LOSE");
                    System.out.println("_________");
                    scorec++;
                } 
                else {
                   System.out.println("MATCH DRAW");
                   System.out.println("_________");
                }
               break; 
               case 2:
               if (b == 0) {
                   System.out.println("YOU WON");
                   System.out.println("_________");
                   scorep++;
               } else if(b == 1) {
                   System.out.println("YOU LOSE");
                   System.out.println("_________");
                   scorec++;
                
               }
               else {
                System.out.println("MATCH DRAW");
                System.out.println("_________");
               }

               break;        
             default:
                 break;
         }



         match++;

         } while (match<6);
         System.out.println("your score:"  +scorep);
         System.out.println("my score:" + scorec);
         if (scorec > scorep) {
            System.out.println("YOU LOSE THE MATCH");
        }
        else if (scorep > scorec){
            System.out.println("YOU WON THE MATCH");
          
        }
       else{
           System.out.println(" IN TOTAL MATCH DRAW");
       } 

        scan.close();
    }
}
