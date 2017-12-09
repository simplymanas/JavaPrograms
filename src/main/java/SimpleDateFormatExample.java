import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Created by Manas Dash on 25/11/17 11:29 PM.
 */
class SimpleDateFormatExample {

    public static void main(String[] args) throws ParseException {
        String dateString = "21-05-2017";
        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
        System.out.println(date);
        System.out.println(dateString);

        date = Calendar.getInstance().getTime();
        System.out.println(date);
        String string = new SimpleDateFormat("mm-DD-yyyy").format(date);
        System.out.println(string);
    }
}
