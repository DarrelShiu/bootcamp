package src;

import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();

    String s = ""; // Even or Odd
    if (input % 2 == 0) {
      s = "Even";
    } else {
      s = "Odd";
    }

    System.out.println("The input number is an " + s + " number.");
  }
  
}
