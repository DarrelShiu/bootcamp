package src;

import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    
    int x = 2;
    int x2 = 8;
    int x3 = 1000;

    // Array
    // ! Store a set of same type of values
    // For exampe. a set of int values
    // 3-> three places to store int values
    int[] arr = new int[3];
    
    // ! write value into array
    // 0 represent the first place of the array
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 1000;
    // arr[3] = 2; // error, array length 3, so you cannot access the 4th places

    // ! read value from array
    System.out.println(arr[0]); // 2
    System.out.println(arr[1]);  // 8
    System.out.println(arr[2]);  // 1000

    // declare double array - 4 values
    // 1.1, 9.2, -9.8, 77.9
    double[] arr2 = new double[4];
    arr2[0] = 1.1;
    arr2[1] = 9.2;
    arr2[2] = -9.8;
    arr2[3] = 77.9;
    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);
    System.out.println(arr2[3]);

    short s1 = (short)-32770;  // 32767
    System.out.println(s1);

    // arr2.length -> array length
    // for (int i = 0; i < 4; i++)
    for (int i41 = 0; i41 < arr2.length; i41++) {
      System.out.println(arr2[i41]);
    }

    // string[]
    String[] arr3 = new String[3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "ghi";

    String[] arr4 = new String[] {"abc","def","boocamp"};
    // for loop
    for (int i42 = 0; i42 < arr4.length; i42++) {
      System.out.println(arr3[i42]);
    }
    // for loop + if (filtering)
    // Find the strings in the array, which length > 4
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i].length() > 4) {
          System.out.println("the length of array values = 4 is " + arr4[i]);
      }
    }
    // for loop + if (AND OR)
    // Print the strings in the array, which length > 4 and starts with 'b'
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i].length() > 4 && arr4[i].startsWith("b")) {
          System.out.println("the length of array values = 4 and starts with 'b' is " + arr4[i]);
      }
    }
    // Print the strings in the array, which length = 3 or endswith 'p'
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i].length() == 3 || arr4[i].endsWith("p")) {
          System.out.println("the length of array values = 3 and ends with \'p\' is " + arr4[i]);
      }
    }

    // 
    int[] arr5 = new int[] {4, 7, -3, 1500, -100, 1000};
    // Print the max value in the array
    // for loop + if
    int box = arr5[0];
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > box) {
          box = arr5[i];
      }
    }
    System.out.println("The max value is " + box);
    // Print the min value in the array
    int min = arr5[0];
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] < min) {
          min = arr5[i];
      }
    }
    System.out.println("The min value is " + min);

    // int[] arr6 = new int[10];
    // int[] arr7 = new int[] {1, 2, 5};
    // int[] arr8 = {1, 2, 5};

    // swap
    int a1 = 6;
    int b1 = 8;

    int temp = b1;
    b1 = a1;
    a1 = temp;

    System.out.println("the value of a1 is " + a1);
    System.out.println("the value of b1 is " + b1);

    int[] arr6 = {9, 7, 10, -3, 1};
    
    for (int i = 0; i < arr6.length - 1; i++) {
      if (arr6[i] > arr6[i + 1]) {
        int box1 = arr6[i + 1];
        arr6[i + 1] = arr6[i];
        arr6[i] = box1;
      }
    }
    System.out.println(Arrays.toString(arr6));

    // sorting
    for (int j = 0; j < arr6.length; j++) {
      for (int i = 0; i < arr6.length - j - 1; i++) {
        if (arr6[i] > arr6[i + 1]) {
          int box1 = arr6[i + 1];
          arr6[i + 1] = arr6[i];
          arr6[i] = box1;
        }
      }
    }
    System.out.println(Arrays.toString(arr6));  // java.lang is by default library; type Arrays then enter -> auto import "import java.util.Arrays"

  } 
}
