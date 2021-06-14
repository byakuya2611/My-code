import models.LandA;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String [] args) {
        System.out.println("hello");
        new SimpleDateFormat("dd/MM/yyyy").parse("05/06/2021");
        //LandA land1 = new LandA(1, Helper.convertStringToDate("05/06/2021"), 2000f, 50f);
    }
}
