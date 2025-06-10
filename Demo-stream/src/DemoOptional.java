package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(Arrays.asList(8, -2, 100));
    Integer result = findFirstOddNumber(integers);
    System.out.println(result);

     Optional<Integer> OptionalResult = findFirstOddNumber2(integers);
      if(OptionalResult.isPresent())
      {
        System.out.println(OptionalResult.get().doubleValue());
      } else {
        System.out.println("No Odd Number");
      }
  }

  
  // what if no odd number
  public static Integer findFirstOddNumber(List<Integer> integers) {
    boolean found = false;
    for (Integer integer : integers) {
      if (integer % 2 == 1) {
        return integer;
      }
    }
    return null;
  }

  public static Optional<Integer> findFirstOddNumber2(List<Integer> integers) {
    boolean found = false;
    for (Integer integer : integers) {
      if (integer % 2 == 1) {
        return Optional.of(integer);
      }
    }
    return Optional.empty();
  }

  public static Integer sum(Optional<Integer> x, Optional<Integer> y) {
    return x.get() + y.get();
  }
}
