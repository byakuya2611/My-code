package aptech;

import java.util.Scanner;

public class Person {
    private String name;
    private Integer age;

    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    public Person() {

    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(String.format("name = %s, age = %d", name, age));
    }

    public void input() {
        System.out.println("Enter person's name");
        this.name = getScanner().next();
        System.out.println("Enter person's age");
        this.age = getScanner().nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
