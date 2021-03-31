package library_management;

import java.util.ArrayList;

public class library {
   ArrayList<Book> books = new ArrayList<>();
   ArrayList<User> users = new ArrayList<>();



   public void addUser(User user ){
       users.add(user);
       System.out.println("User added successfully");
   }
   public void addBook(Book book ){
       books.add(book);
       System.out.println("Book added successfully");

   }

   public void removeBook(Book book){
       books.remove(book);
       System.out.println("Book removed successfully");
   }
   public void removeUser(User user){
       users.remove(user);
       System.out.println("User removed successfully");
   }

   public void issueBook(Book book, User user){
       book.setAvailabe(false);
       System.out.println(book.getName()+ " has been issued by "+ user.getName());
    }
    public void returnBook(Book book, User user){
       book.setAvailabe(true);
        System.out.println(book.getName()+ " has been returned by "+ user.getName());
    }

    public boolean searchbook(String name){
        for (Book b:books) {
           String bookName = b.getName().toLowerCase();
            if(bookName == name.toLowerCase() )
                return true;
        }
       return false;
    }
    
}
