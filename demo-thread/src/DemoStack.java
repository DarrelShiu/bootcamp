package src;

import java.util.Stack;

public class DemoStack {
  
  public static void main(String[] args) {
    // Queue: FIFO
    // Stack: FILO (first in last out)
    Stack s1 = new Stack<>(); // stack has some methods which do not appear in list
    //  Stack<String> s1 = new Stack<>();
    s1.add("John");  // similar push
    s1.add("Peter");
    s1.add("Vincent");
    System.out.println(s1.pop());
    System.out.println(s1.size());
    System.out.println(s1.pop());
    System.out.println(s1.size());

    // undo redo
    

    // Hop Interview Question: Using 2 stacks implement a SuperQueue (first in first out)
  }
}
