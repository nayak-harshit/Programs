package library_management;

import java.util.ArrayList;

public class library {
      public ArrayList<Book> books = new ArrayList<>();
  public ArrayList<User> users = new ArrayList<>();



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
    // searchbook could be optimised
    public boolean searchbook(String name){
        for (Book b:books) {
           String bookName = b.getName().toLowerCase();
            if(bookName == name.toLowerCase() )
                return true;
        }
       return false;
    }

    // for editing user and book details:
    public void changeUserName(User user, String name){
       user.setName(name);
    }
    public void changeUserAge(User user, Integer age){
       user.setAge(age);
    }
    public void changeUserAddress(User user, String address){
       user.setAddress(address);
    }
    public void changeBookName(Book book, String name){
       book.setName(name);
    }
    public void changeBookPrice(Book book, int price){
       book.setPrice(price);
    }
  public void changeBookAuthor(Book book,String author){
       book.setAuthor(author);
    }
  public void changeBookPublisher(Book book, String publisher){
      book.setPublisher(publisher);
    }


    
}
