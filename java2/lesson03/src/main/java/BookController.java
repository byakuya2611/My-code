import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {
    public List<Book> bookList = new ArrayList<>();
    int v;
    Scanner scanner = new Scanner(System.in);
    public void insert() {
        System.out.println("Nhap so luong sach: ");
        v = scanner.nextInt();
        for (int i = 0; i < v; i++) {
            Book book = new Book();
            book.input();
            bookList.add(book);
        }
    }

    public void display() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public void sortByAuthor() {
        this.bookList.sort((Book book1, Book book2)
                -> book1.getAuthor().compareTo(book2.getAuthor()) > 0 ? 1 : -1);
    }

    public void saveBooks() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("data/books.obj");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(bookList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void saveBooksIntoFile() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("data/books.txt");
            for (Book book : bookList) {
                String line = book.toString();
                byte[] data = line.getBytes("utf8");

                fos.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
