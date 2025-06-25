package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SuperQueue {
  private Stack<String> s1 = new Stack<>();  
  private Stack<String> s2 = new Stack<>();

  // 2 Stacks to implement SuperQueue (same as Queue)
  // 1. add
  public void add(String element) {
    // ! step 1: loop move to 2nd stack
    // ! step 2: put the element into 1st stack
    // ! step 3: loop move back to 1st stack

    if (s1.isEmpty() == true) {
      s1.push(element);
      // System.out.println("this is the first item");
    } else {
      // System.out.println("s1 before: " + s1.size());
      // System.out.println("s1 before: " + s1);
      for (int i = s1.size(); i > 0; i--) {
        s2.push(s1.pop());
        // System.out.println("hi");
      }
      // System.out.println("s2" + s2);
      // System.out.println("s1: " + s1.size());

      s1.push(element);
      // System.out.println("s1 after adding new item: " + s1.size());

      for (int i = s2.size(); i > 0; i--) {
        s1.push(s2.pop());
      }
      // System.out.println("s1" + s1);
      // System.out.println("s2: " + s2.size());
    }
  }
  // 2. poll
  // 3. size
  // 4. isEmpty

  public static void main(String[] args) {
    // Queue<String> q1 = new LinkedList<>();
    // q1.add("John");
    // q1.add("Peter");
    // q1.add("Oscar");
    // System.out.println(q1.poll()); // Oscar
    // System.out.println(q1.size());
    // System.out.println(q1.isEmpty());

    SuperQueue sq1 = new SuperQueue();
    sq1.add("aaa");
    sq1.add("bbb");
    sq1.add("ccc");
    sq1.add("ddd");
    sq1.add("eee");

    System.out.println(sq1.s1);
    
    System.out.println(sq1.s1.pop());
    System.out.println(sq1.s1.pop());
    System.out.println(sq1.s1.pop());
    System.out.println(sq1.s1.pop());


    
  }

}