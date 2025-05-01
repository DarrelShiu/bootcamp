package src;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {

    double r1 = 0.1 + 0.2;
    System.out.println(r1); // 0.30000000000000004

    // 2 approaches to create BigDecimal Object
    BigDecimal bd1 = new BigDecimal("0.1"); // type BigDecimal enter -> auto import java.math.BigDecimal
    BigDecimal bd2 = BigDecimal.valueOf(0.2);
    
    BigDecimal bd3 = bd1.add(bd2); // Math "+"
    System.out.println(bd3);

    float f1 = bd3.floatValue();
    double d1 = bd3.doubleValue();
    int i1 = bd3.intValue();
    long l1 = bd3.longValue();
    short s11 = bd3.shortValue();

    String s1 = bd3.toString();
    System.out.println(s1);

    // substract(), multiply()
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println(bd4);
    double result = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue(); // save one variable
    System.out.println(result);
    
    System.out.println(0.1 * 0.2);
    double result2 =  BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println(result2);

    // multiply -> handle decimal places
    // 3.333 * 2 -> 6.666 -> round 2 dp -> 6.67
    double result7 = BigDecimal.valueOf(1.75).multiply(BigDecimal.valueOf(3.65)).setScale(3, RoundingMode.HALF_EVEN).doubleValue();  // 6.3875
    System.out.println("The result of multiplication is :" + result7);

    // divide
    System.out.println(0.3 / 0.1);
    double result3 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result3);

    // 10 / 3 -> 3.33333......
    // Non-terminating decimal expansion
    double result4 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 3, RoundingMode.HALF_EVEN).doubleValue();
    System.out.println("The result of division1 is :" + result4);

    double result6 = BigDecimal.valueOf(17).divide(BigDecimal.valueOf(3), 3, RoundingMode.HALF_EVEN).doubleValue();  // 8.666666
    System.out.println("The result of division2 is :" + result6);

    double result5 = BigDecimal.valueOf(16.5).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_EVEN).doubleValue();  // 8.25 -> 8.3
    System.out.println("The result of division3 is :" + result5);

    // x divide 0 -> undefined
    //  0 divide x -> 0
    // BigDecimal.valueOf(9.9).divide(BigDecimal.valueOf(0)); // error, Division by zero

  }
}
