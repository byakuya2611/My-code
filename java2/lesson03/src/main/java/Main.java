import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        BookController bookController = new BookController();
        Scanner scanner = new Scanner(System.in);
        int c;
        int v;
        do {
            System.out.println("\n1. Nhap thong tin cuon sach.");
            System.out.println("\n2. Hien thi thong tin sach.");
            System.out.println("\n3. Sap xep theo ten tac gia.");
            System.out.println("\n4. Luu thong tin sach vao file data.obj.");
            System.out.println("\n5. Luu thong tin sach vao file data.txt.");
            System.out.println("\n6. Nen file data.txt thanh file data.dfl");
            System.out.println("\n7. Doc du lieu tu file data.obj.");
            System.out.println("\n8. Thoat.");
            System.out.println("\nNhap lua chon cua ban: ");
            c = scanner.nextInt();
            switch (c)
            {
                case 1:
                    bookController.insert();
                    break;
                case 2:
                    bookController.display();
                    break;
                case 3:
                    bookController.sortByAuthor();
                    bookController.display();
                    break;
                case 4:
                    bookController.saveBooks();
                    break;
                case 5:
                    bookController.saveBooksIntoFile();
                    break;
            }
        } while (c !=8 );
    }
}
