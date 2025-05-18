package src;

public class DemoWhileLoop {
  // Alternative - for loop
  // int i = 0 //! do not use i as local variable name in any method

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
    }
  
    int counter = 5;
    while(counter-- > 0) { //5, 4, 3, 2, 1
      System.out.println("bye");
    }

    // ! Difference
    // forLoop - intention to do defined count
    // whileLoop - have no idea of the count
    // 1. while loop: flexible for modifiers (conditional); for loop: standard writing code style
    // 2. break;
  }
}
