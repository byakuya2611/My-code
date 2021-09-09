import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
//        System.out.println("haha");
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        int c;
        do {
            System.out.println("\n\t\t-----------------------------------------");
            System.out.println("\n\t\t|0.Thoat ung dung.\t\t\t\t\t\t|");
            System.out.println("\n\t\t|1.Nhap thong tin sinh vien.\t\t\t|");
            System.out.println("\n\t\t|2.Hien thi thong tin sinh vien.\t\t|");
            System.out.println("\n\t\t|3.Tim kien sinh vien theo roll number. |");
            System.out.println("\nLua chon cua ban: ");
            c = scanner.nextInt();
            switch (c)
            {
                case 1:
                    studentController.insert();
                    break;
                case 2:
                    studentController.display();
                    break;
                case 3:
                    studentController.findByRollNo();
                    break;
                default:
                    break;
            }
        } while (c != 0);
    }
}
