package src.HomeWork;

public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    if (str.contains(String.valueOf(target))) {
      if (str.lastIndexOf(target) == 11) {
        System.out.println("Found." + "\n" + "The index of the last character of c is 11");
      } else {
        System.out.println("Not Found.");
      }
    } else {
      System.out.println("Not Found.");
    }

  }
}
