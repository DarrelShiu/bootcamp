package src;

public class DemoIf {
  public static void main (String[] args) {
    int x = 3;

    if (x < 4) {  //true / false
      System.out.println("hello");
    }

    if(x < 10) {
      System.out.println("goodbye");
    } else {
      System.out.println("welcome");
    }

    // ! Rule
    // Step 1: try "if" condition, if it is true, execute the action, and then Exit
    // Step 2: 

    // if + else if + else
    int y = 80;

    if (y < 90) {
      System.out.println("y is smaller than 90");
    } else if (y >= 90 && y < 100) {
      System.out.println("y is 90 < y 99");
    } else { // y>=100
      System.out.println("y >= 100");
    }

  /*double w
  if w < 100, print "ABC"
  w between 103 and 110, print "DEF"
  for other values, print "XYZ"*/

  double w = 1.101;
  if (w < 100) {
    System.out.println("ABC");
  } else if (w >= 103 && w <= 110) {
    System.out.println("DEF");
  } else {
    System.out.println("XYZ");
  }
  
  // AND &&
  // OR ||
  int a = 1;
  int b = 20;
  if (a > 3 || b < 15) {
    System.out.println("a < 3 or a > 15");
  } else {
    System.out.println("error.");
  }

  int q = 4;
  int u = 80;
  if (q > 2) { // execute
    u += 2;
  } else if (q < 5) { // not execute
    u += 10;
  }
  System.out.println(u);

  q = 3;
  u = 98;
  if (q > 5 && u < 99) {
    System.out.println("hello");
  } else if (q <= 5) {
    System.out.println("bye");
  } else {
    System.out.println("ABC");
  }

  // String
  String s1 = "Hello";
  System.out.println(s1.length()); // 5
  if (s1.length() > 3) {
    System.out.println("Java");
  } else {
    System.out.println("Python");
  }

  String s2 = "ABC";
  String s3 = "ABc";
  if (s2.equals(s3)) {
    System.out.println("Yes");
  } else {
    System.out.println("No");
  }

  String s4 = "JavaStrip";
  int score = 0;
  if (s4.equals("Java")) {
    score += 1;
  } else {
    score +=2;
  }
  System.out.println(score); // 2

  String s5 = "ahaid";
  if(s5.charAt(0) == 'c' || s5.charAt(s5.length()-1) == 'd') {
    System.out.println("yes");
  } else {
    System.out.println("no");
  }

  }
  
}
