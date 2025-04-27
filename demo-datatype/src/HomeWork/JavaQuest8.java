/**
 * Example Output
 * Second Max = 230
 */

 package src.HomeWork;

import java.util.Arrays;

public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] testCase1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] testCase2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] testCase3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] testCase4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...

    // ! testCase1
    for (int j = 0; j < testCase1.length; j++) {
      for (int i = 0; i < testCase1.length - j - 1; i++) {
        if (testCase1[i] > testCase1[i+1]) {
          secondMax = testCase1[i];
          testCase1[i] = testCase1[i+1];
          testCase1[i+1] = secondMax;
        }
      }
    }

  // ! testCase2
  for (int j = 0; j < testCase2.length; j++) {
    for (int i = 0; i < testCase2.length - j - 1; i++) {
      if (testCase2[i] > testCase2[i+1]) {
        secondMax = testCase2[i];
        testCase2[i] = testCase2[i+1];
        testCase2[i+1] = secondMax;
      }
    }
  }

  // ! testCase3
  for (int j = 0; j < testCase3.length; j++) {
    for (int i = 0; i < testCase3.length - j - 1; i++) {
      if (testCase3[i] > testCase3[i+1]) {
        secondMax = testCase3[i];
        testCase3[i] = testCase3[i+1];
        testCase3[i+1] = secondMax;
      }
    }
  }

  // ! testCase4
  for (int j = 0; j < testCase4.length; j++) {
    for (int i = 0; i < testCase4.length - j - 1; i++) {
      if (testCase4[i] > testCase4[i+1]) {
        secondMax = testCase4[i];
        testCase4[i] = testCase4[i+1];
        testCase4[i+1] = secondMax;
      }
    }
  }

  // int[] testCase1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
  // int[] testCase2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
  // int[] testCase3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
  // int[] testCase4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

  // ! result
  // System.out.println("Array:" + Arrays.toString(testCase1)) -> Array:[-10, 5, 80, 100, 230, 240]
  // System.out.println("Array:" + Arrays.toString(testCase2)) -> Array:[-10, 5, 100, 120, 200, 240]
  // System.out.println("Array:" + Arrays.toString(testCase3)) -> Array:[-100, -10, 5, 100, 120, 240]
  // System.out.println("Array:" + Arrays.toString(testCase4)) -> Array:[-10, 5, 80, 100, 240, 240]

  System.out.println("Second Max of testCase1 " + testCase1[testCase1.length-2]);
  System.out.println("Second Max of testCase2 " + testCase2[testCase2.length-2]);
  System.out.println("Second Max of testCase3 " + testCase3[testCase3.length-2]);
  System.out.println("Second Max of testCase4 " + testCase4[testCase4.length-2]);

  }
}