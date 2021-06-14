import models.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length: ");
        rectangle1.setLength(scanner.nextDouble());
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Width: ");
        rectangle1.setWidth(scanner1.nextDouble());
        System.out.println("Rectangle information: "+rectangle1.toString());
    }
}
