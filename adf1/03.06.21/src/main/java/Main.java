import controller.CDController;
import models.CompactDisk;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        CDController cdController = new CDController();
        int x;
        do {
            System.out.println("\n\t\t----------------------------------");
            System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |");
            System.out.println("\t\t|1. Them CD\t\t\t\t\t\t |");
            System.out.println("\t\t|2. Hien thi danh sach CD\t\t |");
            System.out.println("\t\t|3. Hien thi so luong CD\t\t |");
            System.out.println("\t\t|4. Sap xep CD theo gia\t\t\t |");
            System.out.println("\t\t|5. Sap xep CD theo tieu de\t\t |");
            System.out.println("\t\t|6. Hien thi tong gia tien CD\t |");
            System.out.println("\t\t----------------------------------");
            x = scanner.nextInt();
            switch (x)
            {
                case 1:
                    cdController.insert();
                    break;
                case 2:
                    cdController.printAllCDs();
                    break;
                case 3:
                    System.out.println(String.format("Tong so CD: %d", cdController.getNumberOFCDs()));
                    break;
                case 4:
                    cdController.sortByPrice();
                    cdController.printAllCDs();
                    break;
                case 5:
                    cdController.sortByTitle();
                    cdController.printAllCDs();
                    break;
                case 6:
                    System.out.println(String.format("Tong gia thanh Cd: %.1f", cdController.getTotalPrice()));
                    break;
                default:
                    break;
            }
        } while(x != 0);

    }
}
