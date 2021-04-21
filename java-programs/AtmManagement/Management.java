package AtmManagement;

import java.util.ArrayList;

public class Management {

    public ArrayList<UserAccount> User = new ArrayList<>();

    public void addUser( UserAccount user){
        User.add(user);
        System.out.println("User " + user.getName() + " has been added Successfully");
    }

    public void deleteAccount( UserAccount user){
        User.remove(user);
        System.out.println(" Account of user " + user.getName() + " has been deleted Successfully");
    }

//    public boolean withdrawCash(Integer cardNumber, String password, int drawCash){
//        int indexAtCardNumber = -1;
//       findCardIndex: for (int i = 0; i <User.size() ; i++) {
//                         int cardNum = Integer.getInteger(User.get(i).getCardNumber());
//                         if(cardNum == cardNumber){
//                             indexAtCardNumber = i;
//                             break findCardIndex;
//                         }
//       }
//       if(indexAtCardNumber ==  -1){
//           System.out.println("Card Number not found!! \n Try again...");
//           return false;
//       }
//       if(drawCash < User.get(indexAtCardNumber).getBankBalance()){
//           int prevBalance = User.get(indexAtCardNumber).getBankBalance();
//           User.get(indexAtCardNumber).setBankBalance(prevBalance-drawCash);
//           System.out.println("Thank You for Coming \n Remaining Balance " + User.get(indexAtCardNumber).getBankBalance() );
//           return true;
//       }
//       else{
//           System.out.println("Not enough Balance!! \n Balance: " + User.get(indexAtCardNumber).getBankBalance());
//           return false;
//       }
//    }

    public void withdrawCash(UserAccount user, int drawCash){
        user.setBankBalance(user.getBankBalance()- drawCash);
        System.out.println("Remaining Balance: " + user.getBankBalance());
    }
    public UserAccount userLogin(String cardNumber, String password){
        int indexAtCardNumber = -1;
       findCardIndex: for (int i = 0; i <User.size() ; i++) {
                         String cardNum = User.get(i).getCardNumber();
                         if(cardNum.equals(cardNumber)){
                             indexAtCardNumber = i;
                             break findCardIndex;
                         }
       }
        if (indexAtCardNumber == -1) {
            System.out.println("Wrong Card number!!");
            return null;
        }
        if(password.equals(User.get(indexAtCardNumber).getPassword())){
            return User.get(indexAtCardNumber);
        }
        else{
            System.out.println("Wrong password");
            return null;
        }


    }





}
