import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {
    public static Date convertStringToDate(String stringDate) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        } catch (Exception exception) {
            return new Date();
        }
    }
}
