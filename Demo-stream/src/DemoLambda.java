package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.List;

public class DemoLambda {
  
  public static void main(String[] args) {
    // function
    // y = f(x)

    // Function<String, Integer> -> Input(String) -> Output(Intger)
    Function<String, Integer> stringLengthFormula = (str) -> str.length();
    stringLengthFormula.apply("Hello");

    // ! more than one line of code, use{}
    Function<String, Boolean> searchAFunction = (str) -> {
      for(int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'A')
          return true;
      }
      return false;
    };

    System.out.println(searchAFunction.apply("Apple"));
    System.out.println(searchAFunction.apply("Banana"));

    // Bi Function
    BiFunction<String, String, String> concatFunction = (str1, str2) -> str1.concat(str2);
    System.out.println(concatFunction.apply("abc", "def"));

    // Consumer
    Consumer<String> stringPrinter = s -> System.out.println(s);
    stringPrinter.accept("hello");
    stringPrinter.accept("bootcamp");

    // BiConsumer
    BiConsumer<Double, Integer> biStringPrinter = (d1, i1) -> System.out.println(d1 * i1);
    biStringPrinter.accept(3.9, 4);

    // Supplier
    Supplier<Integer> randomNumberGenerator = () -> new Random().nextInt(49) + 1;
    System.out.println(randomNumberGenerator.get());

    // Predicate (True/False formula)
    boolean isAudlt = true;
    Predicate<Integer> adultDefinition = age -> age>=18;
    System.out.println(adultDefinition.test(17));
    System.out.println(adultDefinition.test(18));

    // BiPredicate<Integer, Integer> biCriteria = (p1, p2) -> p1 >= 10 & p2 <= 5;
    BiPredicate<String, Integer> isNameTooLong = (name, upperLimit) -> name.length() > upperLimit;
    System.out.println(isNameTooLong.test("abcdeqwe", 6));

    // UnaryOperator
    BiFunction<String, String, String> replaceXXFunction = (source, from) -> source.replace(from, "xx");
    System.out.println(replaceXXFunction.apply("Hello", "ll"));

    // Binary
    BinaryOperator<String> replaceXXFunction2 = (source, from) -> source.replace(from, "xx");
    System.out.println(replaceXXFunction2.apply("Hello", "ll"));

    // for each
    List<Dog> dogs = new ArrayList<>(Arrays.asList());

   

  }

  
   public static class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }
  }



}
