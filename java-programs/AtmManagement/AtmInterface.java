package AtmManagement;

import java.util.Scanner;

public class AtmInterface {
    static Management  m = new Management();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        UserAccount nayak = new UserAccount(" Nayak", "Chakai", "BMPPK1234", "12345678", "1234");
        m.addUser(nayak);
        System.out.println(nayak.getCardNumber());

        UserAccount risav = new UserAccount("Rishav", "BAnglore", "BMPPK12354", "12345659", "4321");
        m.addUser(risav);
        System.out.println(risav.getCardNumber());
        System.out.println(        nayak.toString());
        System.out.println(        risav.toString());

        UserAccount u1 = UserLogin();
        System.out.println("Do you want to withdraw cash:");
        Boolean draw = scanner.nextBoolean();
        if(draw){
            System.out.println("Enter the amount to withdraw");
            int cash = scanner.nextInt();
            m.withdrawCash(u1,cash);
        }






    }

    public static UserAccount UserLogin(){
        System.out.println("Login:");
        System.out.println("Enter the Card number:");
        String CardNumber = scanner.nextLine();
        System.out.println("Enter your password:");
        String pass = scanner.nextLine();
        UserAccount u = m.userLogin(CardNumber,pass);
        System.out.println("Welcome, " +u.getName());
        return u;
    }

//    public static void addAccount(){
//        System.out.println("Enter the name of Account: ");
//        String usrName = scanner.nextLine();
//
//        System.out.println("Enter the name of User: ");
//        String userName = scanner.nextLine();
//
//        System.out.println("Enter the address of User: ");
//        String userAddress = scanner.nextLine();
//
//        System.out.println("Enter the PanNumber of User: ");
//        String userPan = scanner.nextLine();
//
//        System.out.println("Enter the AdharNumber of User: ");
//        String userAdhar = scanner.nextLine();
//
//        System.out.println("Enter Password of account of User: ");
//        String userPass = scanner.nextLine();
//
//    }


}
