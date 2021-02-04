/*
 Write a function to print the following pattern:(using Recursion also)
 ****
 ***
 **
 *
*/
public class pattern2 {
    static void pattern(){
     for (int i = 0; i < 5; i++) {
         for (int j = 5; j > i; j--) {
             System.out.print("*");
         }
         System.out.println();
     }

    }
    static void ptrnrec(int x){
        if (x>0){
           
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
            ptrnrec(x-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        pattern();
        System.out.println("Pattern 2:(using Recursion)");
        ptrnrec(5);
    }
}
