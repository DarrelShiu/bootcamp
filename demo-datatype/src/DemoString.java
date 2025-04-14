package src;

public class DemoString {
  public static void main(String[] args) {
    // String is NOT primitive, which consist of a set of char values
    // String s = "John";
    // String s2 = "Dear Sir";
    
    // 8 primitives -> store values ONLY
    // String -> Store values + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); // Vincent

    // Function 1: equals()
    System.out.println(s3.equals("Vincent")); // true
    System.out.println(s3.equals("vincent")); // false

    // Function 2: length()
    System.out.println(s3.length()); // 7, how to memorise: why no input? because it is a question: how length -> no input is required

    // Function 3: charAt()
    // index starts with 0
    System.out.println(s3.charAt(2)); // 'n'
    // System.out.println(s3.charAt(-1));

    System.out.println(s3.charAt(s3.length()-1));
  }
  
}
