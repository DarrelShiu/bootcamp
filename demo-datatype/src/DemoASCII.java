package src;

public class DemoASCII {
  public static void main(String[] args) {
    char c = 'a'; // 97 in ascii
    int x = c; // safe
    System.out.println(x); // 97  // boolean, byte (256), short (65536), char (65536), int (32 bit), long (64 bit), float (32 bit), double (64 bit)

    int y = 65;
    char c2 = (char) y; // during compile time, variable y is int range
    // convert from int to char is un-safe
    System.out.println(c2);

    System.out.println((char) 48);  // '0'

    // ! char 0-65535
    System.out.println((char) 65610); // J 

    int x1 = 128;
    byte b1 = (byte) x1;
    System.out.println(b1);  // -128

    // ! byte -> short -> int -> long -> float -> double
    // ! char -> int
    float f1 = 10L;
    System.out.println(f1); // 10.0 
    double d1 = 100.25f;
    System.out.println(d1); // 100.25

    long l2 = (long) 10.9f;
    System.out.println(l2);
  }
  
}
