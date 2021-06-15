package Controller;

import aptech.Person;

import java.util.ArrayList;

public class PersonController {
    static ArrayList<Person> persons = new ArrayList<Person>();
    public static void inputPerson() {
        for (int i = 0; i < 3; i++) {
            Person person = new Person();
            person.input();
            persons.add(person);
        }
    }

    public void sortByAge() {
        this.persons.sort((Person p1, Person p2)
                -> p1.getAge().compareTo(p2.getAge()) > 0 ? 1 : -1);
    }

    public void printAllPersons() {
        for (Person person : this.persons) {
            System.out.println(person.toString());
        }
    }

}
