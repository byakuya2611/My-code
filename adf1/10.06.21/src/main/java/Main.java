import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

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
        for(int i = 0; i < 3; i++) {
            Employee employee = new Employee();
            employee.input();
            employees.add(employee);
        }

        for(int i = 0; i < 3; i++) {
            Manager manager = new Manager();
            manager.input();
            managers.add(manager);
        }

//        persons.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person person1, Person person2) {
//                return person1.getAge() - person2.getAge();
//            }
//        });
//        persons.sort((Person person1, Person person2) ->
//                person1.getAge() - person2.getAge());
//        employees.get(1).increaseSalary(10);
//        employees.get(2).increaseSalary(0.1);
//        employees.sort((Employee employee1, Employee employee2) ->
//                employee1.getSalary() - employee2.getSalary());

    }
}
