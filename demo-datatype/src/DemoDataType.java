package src;

public class DemoDataType {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

    // 8 data type: primitives 
    // 1. (Store integer) byte, short, int, long
    // 2. (Store number with decimal place) float, double
    // 3. (Store Single Character) char
    // 4. (Store true or false) boolean

    // variable
    // ! 1. int
    // ! integer (-ve +ve)

    // "=" -> assignment
    // from right to left
    int x = 3;
    // put y into y
    int y = 7;
    System.out.println(x);
    System.out.println(y);

    // reassign value 10 into variable x
    x = 10;
    System.out.println(x); //10
    y = 100;
    // shortcut: sysout -> System.out.println();
    System.out.println(y); // 100

    // Variable name convention
    // 1. Must be started with a-z eg w1
    // 2. Camel Case eg tutorName

    // Same variable name can be declared once only
    //int a = 4
    int a; // declaration for variable type
    a = 4; // assignment
    System.out.println(a);

    // Declaration and assignment
    int a1 = 10;
    System.out.println(a1);

    // ! 2. double
    double d1 = 4.4;
    System.out.println(d1);
    double d2 = 4.32433423435435; // double decimal place 70 to 80
    System.out.println(d2);
    
    double d3 = 10.45654;
    System.out.println(d3);
    
    // + - * /
    int x2 = 6+1;
    System.out.println(x2);
    int x3 = 9;
    
    // ! put x3 value into variable x2
    x2 = x3;
    System.out.println(x2);
    System.out.println(x3);

    int x4 = 10;
    x2 = 7 + x4;
    System.out.println(x2); // data type only need to declare once

    // ! add 3 to itself
    x2 = x2 +8; // variable value follows from previous flow 
    System.out.println(x2);

    }
}
