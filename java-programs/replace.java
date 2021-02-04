import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        System.out.println("Enter your string:");
        String name;
        Scanner sc =new Scanner(System.in);
        name = sc.nextLine();
        name = name.replace(" ", "_");
        System.out.println(name);
    }
}
