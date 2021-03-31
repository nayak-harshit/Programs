package library_management;

public class Book {
    private String name;
    private Integer price;
    private String author;
    private  String book_id;
    private static int idGenereator = 1;
    private boolean isAvailabe;

    public String getBook_id() {
        return book_id;
    }

    public boolean isAvailabe() {
        return isAvailabe;
    }

    public void setAvailabe(boolean availabe) {
        isAvailabe = availabe;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, Integer price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.isAvailabe = true;
        idAssign();
    }
    private void idAssign(){
        this.book_id = "B" + idGenereator;
        idGenereator++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", book_id='" + book_id + '\'' +
                ", isAvailabe=" + isAvailabe +
                '}';
    }
}


