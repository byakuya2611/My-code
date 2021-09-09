import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentController {
    public Integer maxSize = 100;
    public Map<String, Student> map = new HashMap<>();
    public void insert() {
        Student student = new Student();
        student.input();
        if (map.size() < maxSize) {
            map.put(student.getRollNo(), student);
        } else {
            System.err.println("List is full, cannot update!");
        }
    }
    public void display() {
        for (Map.Entry<String, Student> entry: map.entrySet()){
            Student std = entry.getValue();
            System.out.println(std);
        }
    }

    public void findByRollNo() {
        String r;
        System.out.println("Nhap roll number: ");
        r = (new Scanner(System.in)).next();
        if (map.containsKey(r)) {
            Student std = map.get(r);
            System.out.println(std);
        }

    }

}
