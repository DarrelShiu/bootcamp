package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    
    LocalDate ld1 = LocalDate.of(2025, 4, 28);



    Month m1 = LocalDate.of(2025, 1, 2).getMonth();
    System.out.println(m1.getValue());
    System.out.println(m1.toString());

    LocalDateTime dateTime = LocalDateTime.of(2025, 11, 1, 23, 59, 59);
    System.out.println(dateTime.toString());

  }
  
}
