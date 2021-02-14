import java.util.Scanner;

public class armstrong_number {
    static boolean arm_or_not(int d){
       
        int r = 0;
        int q = d;
 
        while (q >0) {
            // when we divide by 10 the remainder is the last digit of the number..
            r = r + ((q % 10)*(q % 10)*(q % 10));
            q = Math.floorDiv(q, 10);
        }
        if(r==d) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check your number is ARMSTRONG or not: ");
        int a = sc.nextInt();
        System.out.println(arm_or_not(a));
        sc.close();
    }
    
}
