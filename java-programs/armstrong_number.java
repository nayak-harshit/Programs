import java.util.Scanner;

public class armstrong_number {
    public static boolean armstrong_or_not(int d){
       
        int sum_of_cubes = 0;

        while (d >0) {
            // when we divide by 10 the remainder is the last digit of the number..
            sum_of_cubes = sum_of_cubes + ((d % 10)*(d % 10)*(d % 10));
            // after it we change the number to the quotient of the division with 10, so that the next time we get previous digit .
            d = Math.floorDiv(d, 10);
        }
        if(sum_of_cubes == d) return  true;
        return  false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check your number is ARMSTRONG or not: ");
        int a = sc.nextInt();
        System.out.println(armstrong_or_not(a));
        sc.close();
    }
    
}
