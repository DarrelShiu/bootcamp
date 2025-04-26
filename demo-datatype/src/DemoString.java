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
    float f30 = 10.0f;
    int i31 = 7;
    double i32 = i30 / i31;
    float f32 = f30 / i31;
    System.out.println("This double value is " + i32);
    System.out.println("This float value is " + f32);
    // System.out.println("This value is " + 5 / 2.0);

    byte b10 = 127;
    short s10 = 3;
    System.out.println( b10 + s10);

    float f1 = 0.1f;
    float f2 = 0.6f;
    System.out.println(f1 / f2);

    double d1 = 0.7;
    double d2 = 0.1;
    System.out.println(d1 / d2);

    short b30 = 32767;
    System.out.println((short)(b30 + 3));

    int i33 = 7;
    int result = ++i33 * 6;
    // System.out.println(result);

    int i34 = 5;
    int i35 = 9;
    result = i34 += i35 / 3 + 6;
    // System.out.println(result);

    System.out.println(3 + 4 * 4 > 5 * (4 + 3) - 1);
    System.out.println(3 + 4 * 4 > 5 * 7 - 1);
    System.out.println(3 + 16 > 35 - 1);
    System.out.println(19 > 35 - 1);

    double d6 = 7.2;
    boolean isAboveAvg = d6 > 7;
    System.out.println(isAboveAvg);

    int i36 = 5;
    result = (++i36 + 3) * (++i36 +3); //* ++i36; // i36 + 1 the i36 + 1 -> 9*10
    // System.out.println(result);

    int i37 = 5;
    result = (i37++ + 3) * (i37++ + 3); // i37 + 3 then i37 +1 then i37+1 -> 9*5*8
    System.out.println(result);

    boolean isCar = "BMW" != "Benz";
    System.out.println(isCar);

    // short s12 = 32767;
    short s13 = (short)32768;
    System.out.println(s13);

    /*extend data type */
    byte b12 = 127;
    short b13 = (short)b12; // byte b13 = b12 + 1;
    b13 += 100;
    System.out.println(b13);  //Type mismatch: cannot convert from int to byte

    short s14 = 32767;
    int s15 = (int)s14;
    s15 *= s15;
    System.out.println(s15);  //Type mismatch: cannot convert from int to short

    int i23 = 2_147_483_647;
    double d7 = (double)i23;
    d7 *= 1155;  //2.147483647E12,2.3622320117E12
    System.out.println(d7);

    double d8 = 2_147_483_648L;
    System.out.println(d8);

    /*store at lower storage */
    byte b14 = (byte)129;
    System.out.println(b14);

    short b15 = (short)-32770;
    System.out.println(b15);

    int i14 = (int)2_147_483_649L;
    System.out.println(i14);

    float f3 = 0.1f;
    double d9 = (double)f3;
    System.out.println(d9);

    float f4 = 1.2345678912f;
    System.out.println(f4);

    double d10 = 1.1234567812345678d;
    System.out.println(d10);

    String s5 = "abcde";
    System.out.println(s5.charAt(3));

    char c4 = 'A';
    int i15 = (int)c4;
    System.out.println(i15);

    // thanks

    // ! Function 4: indexOf(), lastIndexof()
    String s12 = "Sally";
    System.out.println(s12.indexOf('a')); // single quotation for single character, double quotation for string
    System.out.println(s12.indexOf("a"));
    System.out.println(s12.indexOf("l"));  // 2, first chatacter
    System.out.println(s12.lastIndexOf("l"));


    // ! Function 5: contains()
    System.out.println(s12.contains("ll"));
    System.out.println(s12.contains("lll"));

    // ! Function6: startsWith(), endsWith()
    System.out.println(s12.startsWith("Sa"));
    System.out.println(s12.endsWith("Sa"));

    // ! Function7: isEmpty()
    String s20 = "";
    System.out.println(s20.isEmpty());

    if (s20.isEmpty()) {
      System.out.println("\"yes Enpty");
    } else {
      System.out.println("\"No empty");
    }

    System.out.println("?");

    // ! Function 8: concat()
    String s21 ="abc";
    System.out.println(s21.concat("def"));

    // ! Function 9: replace()
    String s22 = "hello";
    System.out.println(s22.replace("e", "xx"));

    // ! Function 10: substring()
    String s23 = "helloworld";
    System.out.println(s23.substring(4,7));
    
    // ! Funtion 11: toLowerCase(), toUpperCase()
    System.out.println(s22.toLowerCase());
    System.out.println(s22.toUpperCase());

    // ! Function12: .valueOf() -> conversion
    int x1 = 3;
    String ss = String.valueOf(x1); // double.valueOf
    System.out.println(ss);
    // String ss1 = String.valueOf(3.3)

    double d11 = Double.valueOf(3.3);
    System.out.println(d11);

    // char[] chs = "Jacky".toCharArray();
    // System.out.println(chs);
    



  }  
}
