import java.util.Scanner;

public class Student {
    public String rollNo;
    public String name;
    public String sex;
    public Integer age;
    public String email;
    public String address;

    Scanner scanner = new Scanner(System.in);

    public Student() {
    }

    public Student(String rollNo, String name, String sex, Integer age, String email, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Student %s\nName: %s\nSex: %s\nAge: %d\nEmail: %s\nAddress: %s",
                this.rollNo, this.name, this.sex, this.age, this.email, this.address);
    }

    public void input(){
        System.out.println("Enter student's roll number: ");
        rollNo = scanner.next();
        System.out.println("Enter student's name: ");
        name = scanner.next();
        System.out.println("Enter student's sex: ");
        sex = scanner.next();
        System.out.println("Enter student's age: ");
        age = scanner.nextInt();
        System.out.println("Enter student's email: ");
        email = scanner.next();
        System.out.println("Enter student's address: ");
        address = scanner.next();
    }
}
