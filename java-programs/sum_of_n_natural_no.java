import java.util.Scanner;
public class sum_of_n_natural_no {
    static int sumn(int  n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sumn(n-1) ;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("TO FIND THE SUM OF N NATURAL NUMBERS:- \n enter n:");
        System.out.println("The sum is" +sumn(x));
    }
}
