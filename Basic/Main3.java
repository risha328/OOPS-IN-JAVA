class Book{
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
     void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
}
}
public class Main3 {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 15);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12);

        book1.displayInfo();
        book2.displayInfo();
    }
 }

