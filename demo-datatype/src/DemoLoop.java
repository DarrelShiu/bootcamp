package src;

public class DemoLoop {
  public static void main (String[] args) {
    // int x = 2;
    // x *= 2;
    // x *= 2;

    // ! for Loop
    // for (initialisation; continue condition; modifier)
    // Step 1: i = 0
    // Step 2: check if i < 3
    // Step 3: yes, print hello
    // Step 4: i + 1
    // Step 5: check if i < 3
    // Step 6: yes, print hello
    // Step 7: i + 1
    // Step 8: check if i < 3
    // Step 9: yes, print hello
    // Step 10: i + 1
    // Step 11: check if i < 3
    // Step 12: No -> exit loop
    int i = 0;
    for (i = 0; i < 3; i++) {
      System.out.println("Hello");
    }

    // 2^10
    int y = 2;
    for (i = 0; i < 9; i++) {
      y *= 2; // 
    }
    System.out.println(y);

    for (i = 0; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    for (i = 0; i <= 11; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    String s2 = "bootcamp";
    for (i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'm') {
        System.out.println(i);
      } else {
        System.out.println(-1);
      }
    }

  }
  
}
