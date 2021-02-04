import java.util.Scanner;
public class convertLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String name;
        name = sc.nextLine();
        System.out.println("Convert your string to: "); 
        System.out.println("1.UPPER CASE");
        System.out.println("2.lower case");
        int a;
        a = sc.nextInt(3);
        if (a == 1) {
            System.out.println(name.toUpperCase());
        } else if(a == 2) {
            System.out.println(name.toLowerCase());
        }
         

        sc.close();
    }
}
