package src;

// use Wrapper -> benefit: use method (e.g. valueOf, parseint)

public class DemoWrapper {
  public static void main(String[] args) {
    // 8 Primitive
    // int -> Integer
    int x = 3;
    Integer x1 = 3;

    byte b = 4;
    Byte b1 = 4;

    short s = 9;
    Short s1 = 9;

    long l = 8L;
    Long l1 = 8L;

    char c = 'a';
    Character c1 = 'a';

    boolean n = true;
    Boolean n1 = true;

    float f = 1.03f;
    Float f1 = 1.03f;

    double d = 1.99;
    Double d1 = 1.99;

    String s2 = "hello";

    // ! Primitive vs Wrapper Class
    // 1. Primitives for values storage and Math Operations ONLY
    // 2. Wrapper Class has methods
    // 3. Wrapper Class Never use operators (>,<,>=,<=,!=,==) for comparison
    System.out.println(x1.doubleValue()); // 3.0
    System.out.println(x + x1); // int + Integer -> int + int
    Integer x2 = 10;

    // value Comparison (compareTo,equals)
    // non primitive and Wrapper Class use methods
    Integer x3 = 10;
    System.out.println(x2.compareTo(x1)); 
    System.out.println(x1.compareTo(x2)); 
    System.out.println(x2.equals(x1)); // false 

    // Math operation
    System.out.println(x1 + x2);
    System.out.println(x3 * x2);

    // Long x5 = 3;
    // Long x6 = 2;
    System.out.println(Long.valueOf(3).compareTo(Long.valueOf(2)));

    Integer value = Integer.valueOf(13); // created a object with value 13 in heap
    value = 14;
    System.out.println(value);

    Integer num5 = Integer.valueOf(128);
    System.out.println(num5);

    // Convert string to double
    double d2 = Double.parseDouble("0.33") + 0.3;
    System.out.println("this is converted double: " + d2);

  }
  
}
