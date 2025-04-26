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
    int index = -1;
    for (i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'm') {
        // System.out.println(i);
        index = i;
      } //else {
      //   System.out.println(-1);
      // }
    }
    System.out.println(index);

    String s20 = "slallly";
    int i39 = 0;
    for (int i38 = 0; i38 < s20.length(); i38++) {
        if (s20.charAt(i38) == 'l') {
          i39 += 1;
        }
    }
    System.out.println(i39);

    // break
    // Find the first character of 'C' in a given string
    String s4 = "character";
    for (int i40 = 0; i40 < s4.length(); i40++) {
      if (s4.charAt(i40) == 'a') {
        System.out.println(i40);
        break; // break the whole loop (stop the loop, exit the loop)
      }
    }

    // Find the first 3 character of 'a' in a given string
    String s5 = "dsfdfsnfjsneroisve";
    int counter = 0;
    for (int i40 = 0; i40 < s5.length(); i40++) {
      if (s5.charAt(i40) == 's') {
          if (counter == 3) {
            break;
          }
          System.out.println("i40 " + i40);
          counter ++;
      }
    }

    // ! continue + loop
    // Print all indexes of character of 'a' in a given String
    String s6 = "dssfsdfdf";
    for (int i10 = 0;  i10 < s6.length(); i10++) {
      if (s6.charAt(i10) == 's') {
        System.out.println(i10);
      }
    }

    for (int i10 = 0;  i10 < s6.length(); i10++) {
      if (s6.charAt(i10) != 's') {  // better to use this one as the thought and presentation is better
        continue;
      }
      System.out.println(i10);  // Not to do this line if meet the condition of continue
    }


  }
}
