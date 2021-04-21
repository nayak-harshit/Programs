package AtmManagement;

public class UserAccount {
    private String Name, Address, panNumber, adharNumber, password, cardNumber, cvv;
    private int bankBalance = 10000;

    public String getPassword() {
        return password;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }



    public UserAccount(String name, String address, String panNumber, String adharNumber, String password) {
        Name = name;
        Address = address;
        this.panNumber = panNumber;
        this.adharNumber = adharNumber;
        this.password = password;
        this.cardNumber = generateCardNUmber();
        this.cvv = generateCvvNumber();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(String adharNumber) {
        this.adharNumber = adharNumber;
    }

    private static int cardSet = 1000;
    private static int cvvSet = 100;


    private String generateCardNUmber(){
        String cdnum = "112356749021" + cardSet;
        cardSet++;
        return  cdnum;
    }

    private  String generateCvvNumber(){
        String cv = "" +cvvSet;
        cvvSet++;
        return cv;
    }

    @Override
    public String toString() {
        return "UserAccountDetails{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", panNumber='" + panNumber + '\'' +
                ", adharNumber='" + adharNumber + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", bankBalance=" + bankBalance +
                '}';
    }
}
