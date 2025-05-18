package src;

import java.util.Arrays;

public class DemoForEachLoop {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 10 , -1, 5, 6};
    // for loop
    // Use i as index pattern to read the array values.
    for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        System.out.println(arr[i] + " " + arr[arr.length - i - 1]);  // 2, 1 ,0
    }
    // for-each loop
    // implicitly you want to read the array in sequence, and one by one
    for (int x : arr) {
      System.out.println(x);
    }

    int temp;
    for (int i = 0; i < arr.length / 2; i++) { // 0, 1
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1]; // 0 <> 3, 1 <> 2
      arr[arr.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
  
}
