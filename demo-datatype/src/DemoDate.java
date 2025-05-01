package src;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DemoDate {
  public static void main(String[] args) {
    
    LocalDate today = LocalDate.now();
    System.out.println("Today is " + today);

    LocalDate parsedDate = LocalDate.parse("2025-04-28");

    LocalDate ld1 = LocalDate.of(2025, 4, 28);
    DayOfWeek pow = ld1.getDayOfWeek();
    int month = ld1.getMonthValue();
    System.out.println("Weekday is: " + month);

    LocalDate ld2 = ld1.plusDays(1);


    Month m1 = LocalDate.of(2025, 1, 2).getMonth();
    System.out.println(m1.getValue());
    System.out.println(m1.toString());

    LocalDateTime dateTime = LocalDateTime.of(2025, 11, 1, 23, 59, 59);
    System.out.println(dateTime.toString());

    LocalDateTime dateTime1 = LocalDateTime.now();
    System.out.println(dateTime1);

    LocalDate ld4 = LocalDate.of(2025, 4, 10);
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    String date1 = "10 August 2025";
    LocalDate parseDate = LocalDate.parse(date1, format);
    System.out.println("Today is " + parseDate);
    
    System.out.println(String.valueOf(date1));

    System.out.println("The month is " + ld4.getMonth());
    System.out.println("The month is " + ld4.getDayOfWeek());

    boolean isAfterToday = LocalDate.now().isAfter(ld4);
    System.out.println(isAfterToday);


  }
  
}
