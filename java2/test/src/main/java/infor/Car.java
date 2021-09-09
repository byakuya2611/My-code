package infor;

import java.util.Scanner;

public class Car extends IInfor{
    public String color;

    public Car() {
    }

    public Car(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    Scanner scanner = new Scanner(System.in);
    public void input() {
        System.out.println("Enter car's name: ");
        name = scanner.next();
        System.out.println("Enter car's color: ");
        color = scanner.next();
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.println("color = " + color);
    }
}
