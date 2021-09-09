import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Book implements Serializable {
    String bookName, author;
    Float price;
    String publicationDate,producer;

    Scanner scanner = new Scanner(System.in);

    public Book() {
    }

    public Book(String bookName, String author, Float price, String publicationDate, String producer) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.publicationDate = publicationDate;
        this.producer = producer;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void input() {
        System.out.println("Enter book's name: ");
        bookName = scanner.next();
        System.out.println("Enter book's author: ");
        author = scanner.next();
        System.out.println("Enter book's price: ");
        price = scanner.nextFloat();
        System.out.println("Enter book's publication date: ");
        publicationDate = scanner.next();
        System.out.println("Enter book's producer: ");
        producer = scanner.next();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationDate='" + publicationDate + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
