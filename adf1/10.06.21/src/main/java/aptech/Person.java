package aptech;

import java.util.Scanner;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.getAge() - p.getAge();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
