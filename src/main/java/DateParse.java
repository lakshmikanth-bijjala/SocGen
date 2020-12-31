


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParse {
/*  public static void main(String args[]) {
    Timestamp ts = new Timestamp(1604480074000);
    Date date = new Date(ts.getTime());
    System.out.println(date);
  }*/

    public static void main(String args[])
    {

        long miliSec = 1604480074000L;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date result = new Date(miliSec);

        System.out.println(formatter.format(result));
    }
}