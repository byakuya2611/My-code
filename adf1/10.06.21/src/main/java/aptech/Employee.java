package aptech;

public class Employee extends Person{
    private int salary;

    public Employee(){

    }
    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Enter salary: ");
        this.salary = getScanner().nextInt();
    }

    public void increaseSalary(int x) {
        this.salary += x;
    }
    public void increaseSalary(double x) {
        this.salary = (int)((double)this.salary * x);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(String.format("salary = %d", this.salary));
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
