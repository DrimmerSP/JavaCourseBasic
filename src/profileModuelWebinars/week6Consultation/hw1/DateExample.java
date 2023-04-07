package week6.consultation.hw1;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) throws ParseException {
        String str = "02.30.2023";
        String str2 = "30.02.2023";

        DateFormat df1 = new SimpleDateFormat("MM.dd.yyyy");
        DateFormat df2 = new SimpleDateFormat("MM.dd.yyyy");
        Date strDate = df2.parse(str);
        System.out.println(strDate);


        LocalDate date = LocalDate.parse(str2, DateTimeFormatter.ofPattern("dd.MM.uuuu").withResolverStyle(ResolverStyle.LENIENT));
        System.out.println(date);

        LocalDate date2 = LocalDate.parse(str2, DateTimeFormatter.ofPattern("dd.MM.yyyy"));;
        System.out.println(date2);
    }

}
