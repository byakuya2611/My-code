import infor.Car;
import infor.People;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
//        System.out.println("haha");
        int c;
        ArrayList<People> peoples = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of people: ");
        c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            People people = new People();
            people.input();
            peoples.add(people);
        }
        for (People people: peoples) {
            people.showInfor();
        }
        System.out.println("Enter number of cars: ");
        c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            Car car = new Car();
            car.input();
            cars.add(car);
        }
        for (Car car: cars) {
            car.showInfor();
        }
    }
}
