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

        library library = new library();
        library.books.add(maths);
        library.books.add(lit);
        library.users.add(dhruv);
        library.users.add(rishi);

        library.issueBook(maths, dhruv);
        library.issueBook(maths, rishi);// trying to issue a issued book
        System.out.println(maths.toString());

        library.changeUserName(rishi, "RishiMaster");
        System.out.println(rishi.toString());


        System.out.println( library.searchbook("maths"));
        library.returnBook(maths, dhruv);

    }

}
