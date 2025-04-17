package src;

public class DemoIf {
  public static void main (String[] args) {
    int x = 3;

    if (x < 4) {  //true / false
      System.out.println("hello");
    }

    if(x < 10) {
      System.out.println("goodbye");
    } else {
      System.out.println("welcome");
    }

    // if + else if + else
    int y = 80;

    if (y < 90) {
      System.out.println("y is smaller than 90");
    } else if (y >= 90 && y < 100) {
      System.out.println("y is 90 < y 99");
    } else { // y>=100
      System.out.println("y >= 100");
    }
    
  }
  
}
