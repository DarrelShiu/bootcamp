package src;

public class DemoLiteral {
  // ! Literal Pool -> String
  // ! Internal Cache -> Integer, Byte, Short, Long, Boolean, Character 
  public static void main(String[] args) {
    String s1 = "hello"; // if no new String
    String s2 = "hello";
    String s3 = "olleh";
    String s7 = "hello";
    System.out.println(s1.equals(s2)); // true, string Author determine the definition of equal
    System.out.println(s1.equals(s3)); // false

    System.out.println(s1 == s2); // true

    String s4 = new String("hello");
    System.out.println(s1 == s4); // false
    String s5 = new String("hello");
    System.out.println(s4 == s5); // false

    String s6 = new String("hello").intern();
    System.out.println(s1 == s6); // 
    System.out.println(s4 == s6); // 
    System.out.println(s2 == s6); // 
    System.out.println(s5 == s6); // 

    // -128 to 127

    // Character (0 - 6xxxxx), cache range 0-127
    Character c1 = 'a';
    Character c2 = 'a';
    System.out.println(c1 == c2);

    Character c3 = new Character('a');
    System.out.println(c1 == c3);

    Integer i10 = Integer.valueOf(10);
  }
}
