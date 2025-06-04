package src;

import java.util.Scanner;

public class ExceptionExercise2 {
  // Question: Write a program that takes an array of integers and prints the element at a
  // user-provided index. Handle ArrayIndexOutOfBoundsException and NumberFormatException.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. If ArrayIndexOutOfBoundsException is caught, print "Error: Index is out of bounds."
  // 3. If no exception is caught, print "Element at index X: Y"
  // 4. No matter if the exception is caught, finally print "Array retrieval attempt completed."

    // public static int result(boolean err, int i) {
    // if (err == true) {
    //   throw new RuntimeException("Still errors");
    //   }
    //   return i;
    // }

  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index to retrieve: ");
    String input = scanner.nextLine(); // read String
    scanner.close();

    int output;
    boolean err = false;
    

    // code here ...
    // try, catch, finally
    try {
      System.out.println("Element at index X: " + numbers[Integer.parseInt(input)]);
    } catch (NumberFormatException e) {
      // throw new NumberFormatException("Error: Please enter a valid number.");
      System.out.println("Error: Please enter a valid number.");
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new ArrayIndexOutOfBoundsException("Error: Index is out of bounds.");
    } finally {
      System.out.println("Array retrieval attempt completed.");
    }

    // try {
    //   System.out.println(numbers[result(err, Integer.parseInt(input))]);
    // } catch (RuntimeException e) {
    //   System.out.println("Err:" + e.getMessage());
    // } finally {
    //   System.out.println("Array retrieval attempt completed.");
    // }




  }
}
