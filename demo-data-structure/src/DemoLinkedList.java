package src;

import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    // ArrayList () and LinkedList (suitable for frequent addition)
    // Same:
    // 1. with Ordering
    // 2. store a set of values

    // Difference
    // 1. Underlying Data Structure
    // 2. Scenario: get(), add(), remove()

    LinkedList<String> fruits = new LinkedList<>();  // can replace ArrayList but with different concept (data structure: linklist vs array)
    fruits.add("apple");
    fruits.add("orange");  // apple -> orange (address)
    fruits.add("apple");  // orange -> apple 
    fruits.add("lemon");  // apple -> lemon
    System.out.println(fruits.size());
    System.out.println(fruits.get(1));

    fruits.remove(3);

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    if (fruits.contains("apple")) {
      System.out.println("yes");
    }

  }
}
