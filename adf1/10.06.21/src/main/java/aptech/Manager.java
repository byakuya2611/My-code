package aptech;

public class Manager extends Employee implements Tax{
    private double bonus;

    public Manager() {

    }
    public Manager(String name, int age, int salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Enter bonus: ");
        this.bonus = getScanner().nextDouble();
    }

    @Override
    public double calculateTax() {
        double tax = this.getSalary() * 0.1;
        int newSalary = (int)((double)this.getSalary() + bonus - this.getSalary() * 0.1);
        this.setSalary(newSalary);
        return tax;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(String.format("bonus = %f", bonus));
    }
}
