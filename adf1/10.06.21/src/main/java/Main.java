import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import Controller.PersonController;
import aptech.*;
public class Main {
    public static void main(String [] args) {
        System.out.println("haha");
        ArrayList<Person> persons = new ArrayList<Person>();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Manager> managers = new ArrayList<Manager>();
        for(int i = 0; i < 3; i++) {
            Person person = new Person();
            person.input();
            persons.add(person);
        }
        persons.sort((Person person1, Person person2) ->
                person1.getAge() - person2.getAge());
        for (Person person: persons) {
            person.display();
        }
        for(int i = 0; i < 3; i++) {
            Employee employee = new Employee();
            employee.input();
            employees.add(employee);
        }
        employees.get(1).increaseSalary(10);
        employees.get(2).increaseSalary(1.1);
        employees.sort((Employee employee1, Employee employee2) ->
                employee1.getSalary() - employee2.getSalary());
        for (Employee employee: employees) {
            employee.display();
        }

//        for(int i = 0; i < 3; i++) {
//            Manager manager = new Manager();
//            manager.input();
//            managers.add(manager);
//        }

    }
}
