package library_management;

public class LibraryManagement {

    public static void main(String[] args) {
        User dhruv =  new User("Dhruv", 4, "Chakai");
        User rishi = new User("Rishi", 8, "Jamui");

        Book maths = new Book("Maths for class 9", 495, "R.D.Sharma");
        Book lit = new Book("Alchemist", 315, "Pauhleo Cauhleo");

        System.out.println(dhruv.toString());
        System.out.println(rishi.toString());

        System.out.println(maths.toString());
        System.out.println(lit.toString());

    }

}
