package Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtility {
    public static Date convertStringToDateTime(String stringDateTime) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(stringDateTime);
        }catch (ParseException exception) {
            //return new Date();
            return null;
        }

    }
}
