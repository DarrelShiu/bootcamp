package src;

public class Test {
  static int i;

  public static int add(int n) {
    if (n % 2 == 0) {
       if(n < 0) {
      return 0;
      }
      return n + add(n - 2);
    }
    return 0;
    // System.out.println("odd number");
  }

  public static void main(String[] args) {
    System.out.println(add(7)); // 8 6 4 2
  }
}


// n + add(n)
// 5 + add(4)
// 
// 
// 
