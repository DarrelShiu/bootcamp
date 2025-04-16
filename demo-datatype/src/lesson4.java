package src;

public class lesson4 {
  public static void main (String[] args) {
    int age = 3;
    System.out.println(age);
    age +=5;
    System.out.println(age);

    // byte,short,int,long, (store integer)
    byte b1 = 3;
    System.out.println(b1);
    short s1 = 3;
    System.out.println(s1);
    int i1 = 3;
    long l1 = 3;

    // byte (-128  127)
    // short (-32xxx  32xxx)
    // int (-2100M  2100M)
    // long (2^63)

    i1 = 2_147_483_647;
    i1 += 2; // int + int -> check overflow
    System.out.println(i1);
    i1 = -2_147_483_648;
    i1 -= 1;
    System.out.println(i1);

    // 1. Prepare an int value
    // 2. Assign a value into long variable (left hand side)
    // l1 = 2_200_000_000;
    l1 = 2_200_000_000l;
    l1 += l1;
    System.out.println(l1);

    // long + int -> long + long -> long
    long l2;
    l2 = 3 + 2_200_000_000l;
    System.out.println(l2);

    short s10 = 10;
    int i10 = 20;
    System.out.println(s10 + i10);

    byte b11 = 2;
    short s11 = 6;
    System.out.println(s11 + b11);

    // byte short?
    // int i8 = 9;
    // byte b9 = i8; // what is the type of i8? ooo... it is int, sorry not OK

    // byte -> short -> int -> long 
    byte b10 = 3; // direct value -> safe
    System.out.println(b10);
    
    // Java default use int
    // ! the range of int value should solve the majority of the problems in system.
    // so we won't use long as a default type of variable for storing integer

    // boolean (either true or false)
    boolean b9 = true;
    b9 = false;
    System.out.println(b9);

    int result = 5;
    boolean isResultOddNumber = result % 2 == 1; // "==" -> checking if equals to
    System.out.println(isResultOddNumber);

    int age1 = 65;
    boolean isElderly = age1 >= 65; // formula / definition
    System.out.println(isElderly);

    // char
    // single quote
    // assign char value 'a' into char variable
    char c1 = 'a';
    System.out.println(c1);

    char c2 = 'A';
    System.out.println(c1 == c2); // false, because Java is case sensitive

    // Java default int or double
    // float (store decimal number)
    // 3.14169 is double value
    // so unsafe (assign double value to float variable)
    float f1 = 3.14159f; // float lowercase f; double uppercase L
    System.out.println(f1);
    float f2 = 0.1f + 0.6f;
    System.out.println(f2);

    // We cannot assign a bigger range of variable to smaller range of variable (by default)
    // force assignment
    byte b40 = (byte) 128L;
    System.out.println(b40); // 127 overflow, if addition, move to the leftmost

    // step 1: think whether it is a safe value -> add f or L since Java default int and double
    // step 2: int + int -> int; int + long -> long

    char c3 = 'a';
    System.out.println(c3);

  }
}
