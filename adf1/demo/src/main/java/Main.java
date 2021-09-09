import models.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
//        System.out.println("haha");
        Rectangle rectangle1 = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        rectangle1.setLength(scanner.nextDouble());
        System.out.println("Enter width: ");
        rectangle1.setWidth(scanner.nextDouble());
        System.out.println("Rectangle: " + rectangle1);
    }
}
