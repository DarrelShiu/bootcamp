package src;

import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    
    System.out.println("please input a number");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    String s = ""; // Even or Odd
    if (input % 2 == 0) {
      s = "Even";
    } else {
      s = "Odd";
    }

    System.out.println("The input number is an " + s + " number.");

    scanner.nextLine();

    System.out.println("hi");
    String s1 = scanner.nextLine();
    System.out.println("output is " + s1);

    scanner.close();


  }
  
}
