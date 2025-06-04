package src;

import java.util.Scanner;

public class ExceptionExercise1 {
  // Question: Write a program that divides two numbers provided by the user. Handle the
  // ArithmeticException when dividing by zero and display an appropriate message.

  // 1. If exception is caught, print "Error: Cannot divide by zero.", otherwise print "Result: X"
  // 2. No matter if the exception is caught, finally print "Division operation completed."

  public static int add(int num, int den) throws DividedByZero {
      if (den == 0) {
        throw new DividedByZero("Custom Cannot divide by 0");
      }  
      return num / den;
    }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter numerator: ");
    int numerator = scanner.nextInt();
    System.out.print("Enter denominator: ");
    int denominator = scanner.nextInt();
    scanner.close();

    int result;
    

    // try {
    //   result = numerator / denominator;
    //   System.out.println("Result: " + result);
    // } catch (ArithmeticException e) {
    //   System.out.println("Error: Cannot divide by zero." + e.getClass().getName());
    //   // throw new ArithmeticException("Error: Cannot divide" + e);
    // } finally {
    //   System.out.println("Division operation completed.");
    // }
    
    try {
      result = add(numerator, denominator);
      System.out.println("Result: " + result);
    } catch (DividedByZero e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Division operation completed.");
    }

  }
}

// Enter numerator: 7
// Enter denominator: 0
// Division operation completed.
// Exception in thread "main" java.lang.ArithmeticException: Error: Cannot dividejava.lang.ArithmeticException: / by zero
//         at src.ExceptionExercise1.main(ExceptionExercise1.java:35)
// PS C:\github\bootcamp\LoopExercise> 