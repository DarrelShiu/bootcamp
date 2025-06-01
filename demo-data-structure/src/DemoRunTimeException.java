package src;

public class DemoRunTimeException {


  /**
   * @param args
   */
  public static void main(String[] args) {
    
    //    //  StringIndexOutofBound (s.charAt(3)) which is avoidable
    //     // NummPointerException (NPE)
    // String userInput = null;
    // if (userInput != null) {
    //   getStringLength(null); // avoidable program issue

      int[] arr = new int[]{3, 8, -1};

      for (int i = 0; i < arr.length; i++) {  // avoidable program issue (java.ArrayIndexOutOfBound)
        System.out.println(arr[i]);
      }

  // public static int getStringLength(String s) {
  //   return s.length();
  // }

  String number = "abcd";
  
  /**
   * Java doc
   */
  try {
      Integer converted = Integer.parseInt(number);
      System.out.println(converted);
  } catch (NumberFormatException ex) {
    System.out.println("bye");
  }

    }
  
}



