
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat dataFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dataFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dataFormat3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dataFormat3.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        Date y1 = (Date) dataFormat1.parse("25/06/2018");
        Date y2 = (Date) dataFormat2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);

        System.out.println("---------------------------------------------------------------");

        System.out.println("x1: " + dataFormat2.format(x1));
        System.out.println("x2: " + dataFormat2.format(x2));
        System.out.println("x3: " + dataFormat2.format(x3));
        System.out.println("x4: " + dataFormat2.format(x4));
        System.out.println("y1: " + dataFormat2.format(y1));
        System.out.println("y2: " + dataFormat2.format(y2));
        System.out.println("y3: " + dataFormat2.format(y3));

        System.out.println("---------------------------------------------------------------");

        System.out.println("x1: " + dataFormat3.format(x1));
        System.out.println("x2: " + dataFormat3.format(x2));
        System.out.println("x3: " + dataFormat3.format(x3));
        System.out.println("x4: " + dataFormat3.format(x4));
        System.out.println("y1: " + dataFormat3.format(y1));
        System.out.println("y2: " + dataFormat3.format(y2));
        System.out.println("y3: " + dataFormat3.format(y3));
    }
}
