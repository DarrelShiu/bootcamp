package src;

public class DemoString {
  public static void main(String[] args) {
    // String is NOT primitive, which consist of a set of char values
    // String s = "John";
    // String s2 = "Dear Sir";
    
    // 8 primitives -> store values ONLY
    // String -> Store values + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); // Vincent

    // Function 1: equals()
    System.out.println(s3.equals("Vincent")); // true
    System.out.println(s3.equals("vincent")); // false

    // Function 2: length()
    System.out.println(s3.length()); // 7, how to memorise: why no input? because it is a question: how length -> no input is required

    // Function 3: charAt()
    // index starts with 0
    System.out.println(s3.charAt(2)); // 'n'
    // System.out.println(s3.charAt(-1));

    System.out.println(s3.charAt(s3.length()-1));

    // find the middle character of name
    // Joey -> o or e
    // Vincent -> c

    String s4 = "datrel";
    int midChar = s4.length() / 2;
    System.out.println(s4.charAt(midChar));

    if (s4.length() % 2 == 0) {
        System.out.println(s4.charAt(s4.length() / 2 - 1));
    } else {
      System.out.println(s4.charAt(s4.length() / 2));
    };


    int i11 = 3;
    double i12 = 79.0;
    double i13 = i12 / i11;
    System.out.println(i13);

    float i20 = 7.0f;
    int i21 = 3;
    float i22 = i20 / i21;
    System.out.println(i22);

    // int int trim
    // int float x.xxxxxx
    // float float x.xxxxxxx

    // byte,short,bit,long
    // int i30 = 10;
    double i30 = 10.0;
    // float i30 = 10.0f;
    int i31 = 7;
    double i32 = i30 / i31;
    System.out.println("This value is " + i32);

    System.out.println("This value is " + 5 / 2.0);

    byte b10 = 127;
    short s10 = 3;
    System.out.println( b10 + s10);

    float f1 = 0.1f;
    float f2 = 0.6f;
    System.out.println(f1 + f2);

    short b30 = 32767;
    System.out.println((short)(b30 + 3));

  }  
}
