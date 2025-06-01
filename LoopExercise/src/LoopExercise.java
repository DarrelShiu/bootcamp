package src;

import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    System.out.print("ans 1: ");
    for (int i = 0; i < 6; i++) {
      System.out.print("hello" + " ");
    }
    System.out.println();

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    System.out.print("ans 2: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(i + " ");
    }
    System.out.println(); 

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    System.out.print("ans 3: ");
    for (int i = 2; i < 21; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    } 
    System.out.println();

    // 4. Print the numbers between 1 and 100, which can be divided by 3 or 5
    // Use: for loop + if
    System.out.print("ans 4: ");
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
          System.out.print(i + " ");
      }
    }
    System.out.println();

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    System.out.print("ans 5: ");
    int j = 0;
    for (int i = 0; i < 16; i++) {
      j += i;
    }
    System.out.println(j);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    System.out.print("ans 6: ");
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 != 0) {
        oddSum += i;
      } 
      if (i % 2 == 0) {
        evenSum += i;
      }
    }
    System.out.println(oddSum * evenSum);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    System.out.print("ans 7: ");
    String str7 = "ijkabcpodi";
    // String str7 = "abc";
    if (str7.indexOf('d') != -1) {
      System.out.println("d is found.");
    } else {
     System.out.println("d is not found.");
    }
    // if (str7.contains("z")) {
    //   System.out.println("d is found.");
    // } else {
    //   System.out.println("d is not found.");
    // }
    
    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    System.out.print("ans 8: ");
    // String s8a = "abcba";
    String s8a = "abcbaedasdvfb";
    String s8b = "dve";
    
    boolean hasSubstring = true;
    for (int i = 0; i < s8a.length() - 2; i++) {
      if (s8a.substring(i, i + 3).equals(s8b)) {
        // System.out.println("s8b is a substring.");
        // break;
        hasSubstring = true;
        break;
      } else {
        hasSubstring = false;
      }
      // System.out.println("s8b is not a substring.");
    }
    if (hasSubstring) {
      System.out.println("s8b is a substring.");
    } else {
      System.out.println("s8b is not a substring.");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    System.out.print("ans 9: ");
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9) {
        count++;
      }
    }
    System.err.println("count=" + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    System.out.print("ans 10: ");
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    String[] arr10Revised = new String[arr10.length];
    for (int i = 0; i < arr10.length; i++) {
      arr10Revised[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10Revised));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    System.out.print("ans 11: ");
    String s11 = "kLKloOOurRQq";
    String s12 = s11.toUpperCase();
    int count1 = 0;
    for (int i = 0; i < s11.length(); i++) {
      if (s11.charAt(i) == s12.charAt(i)) {
          count1++;
      }
    }
    System.out.println("count uppercase=" + count1);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    System.out.print("ans 12: ");
    for (int k = 0; k < 3; k++) {
      for (int i = 0; i < 5; i++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop
    // l -> 1 score 2
    // r -> 3 score 1
    // d -> 2 score 1
    // u -> 4 score 2
    // for other character, -1 score
    System.out.print("ans 13: ");
    String s13 = "lrlaudbucp";
    int score = 0;
    for (int i = 0; i < s13.length(); i++) {
      switch (s13.charAt(i)) {
        case 'l':
          score += 1;
          break;
        case 'r':
          score += 3;
          break;
        case 'd':
          score += 2;
          break;
        case 'u':
          score += 4;
          break;
        default:
          score += -1;
          break;
      }
    }
    System.out.println("total score=" + score);

    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    System.out.print("ans 14: ");
    long[] arr14 = new long[4];
    // long[] arr14 = new long[6];
    arr14[0] = (long) 1;
    arr14[1] = (long) 4;
    arr14[2] = (long) 9;
    arr14[3] = (long) -4;
    // arr14[4] = (long) -10;
    // arr14[5] = (long) 6;
    System.out.println(Arrays.toString(arr14));

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    System.out.print("ans 15: ");
    long maxValue = arr14[0];
    long minValue = arr14[0];
    for (int i = 0; i < arr14.length - 1; i++) {
      if (maxValue < arr14[i + 1]) {
          maxValue = arr14[i + 1];
      }
      if (minValue > arr14[i + 1]) {
          minValue = arr14[i + 1];
      }
    }
    System.out.println("max value=" + maxValue +"| " + "min value=" + minValue);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    System.out.print("ans 16: ");
    float[] arr17 = new float[] {0.2f, 0.3f, 0.6f};
    System.out.println(Arrays.toString(arr17));

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    System.out.print("ans 17: ");
    BigDecimal[] arr16 = new BigDecimal[] {BigDecimal.valueOf(0.3), BigDecimal.valueOf(0.4), BigDecimal.valueOf(0.7)};
    BigDecimal num1 = BigDecimal.valueOf(0.1);
    for (int i = 0; i < arr16.length; i++) {
      arr16[i] = arr16[i].add(num1);
    }
    System.out.println(Arrays.toString(arr16));


    // 18. Count the number of target strings in the String[]
    System.out.print("ans 18: ");
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Lydia", "Lydia", "Tommy", "Lydia"};
    String target = "Lydia";
    int countTarget = 0;
    // Print "count name=2"
    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i].equals(target)) {
        countTarget++;
      }
    }
    System.out.println("count name=" + countTarget);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    System.out.print("ans 19: ");
    String s19 = "40289";
    int[] arr20 = Arrays.stream(s19.split("")).mapToInt(Integer::parseInt).toArray();
    int maxDigit = arr20[0];
    int minDigit = arr20[0];
    int maxDigitLoc = 0;
    int minDigitLoc = 0;
    double result = 0d;
    int resultInt = 0;
    int temp;
    for (int i = 0; i < arr20.length - 1; i++) {
      if (maxDigit < arr20[i + 1]) {
        maxDigit = arr20[i + 1];
        maxDigitLoc = i + 1;
      }
      if (minDigit > arr20[i + 1]) {
        minDigit = arr20[i + 1];
        minDigitLoc = i + 1;
      }
    }
    // System.out.println(maxDigit + " " + maxDigitLoc);
    // System.out.println(minDigit + " " + minDigitLoc);

    temp = arr20[maxDigitLoc];
    arr20[maxDigitLoc] = arr20[minDigitLoc];
    arr20[minDigitLoc] = temp;

    // String s1 = Arrays.toString(arr20);
    // System.out.println(s1);

    for (int i = arr20.length; i > 0; i--) {
      result += arr20[arr20.length - i] * Math.pow(10, i - 1);
    }
    resultInt = (int) result;
    System.out.println(resultInt);

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    System.out.print("ans 20: ");
    String[] arr21 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    int arr21Length = arr21[0].length();
    int arr21MaxLengthLoc = 0;
    for (int i = 0; i < arr21.length - 1; i++) {
      if (arr21Length < arr21[i + 1].length()) {
        arr21Length = arr21[i + 1].length();
        arr21MaxLengthLoc = i + 1;
      }
    }
    System.out.println("longest="+ arr21[arr21MaxLengthLoc]);

  }
}
