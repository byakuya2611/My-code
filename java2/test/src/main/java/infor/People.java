package infor;

import java.util.Scanner;

public class People extends IInfor{
    public Integer age;
    public String address;

    public People() {
    }

    public People(String name, Integer age, String address) {
        super(name);
        this.age = age;
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    Scanner scanner = new Scanner(System.in);
    public void input() {
        System.out.println("Enter person's name: ");
        this.name = scanner.next();
        System.out.println("Enter person's age: ");
        age = scanner.nextInt();
        System.out.println("Enter person's address: ");
        address = scanner.next();
    }

    @Override
    public void showInfor() {
        super.showInfor();
        System.out.println("age = " + age + "\naddress = " + address);
    }
}
