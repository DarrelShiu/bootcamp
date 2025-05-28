package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {

  public static void main(String[] args) {

    // Queue
    // 1. add() -> addLast()
    Queue<String> fruits = new LinkedList<>();  // polymorphism 
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("lemon");
    System.out.println(fruits.poll());   // apple (take away the first element from the queue)
    System.out.println(fruits.size());
    System.out.println(fruits.peek()); // orange (take a look on the first element)
    // no get() method in Queue

    // The most common logic to use a queue
    while (!fruits.isEmpty()) {
      System.out.println(fruits.poll());
    }

    if (fruits.contains("lemon")) { // ! why can call contains because Queue is an interface and has contains -> polymorphism

    }

    // ! why queue? arrayList is also with ordering
    // 1. queue has less method to use (sepecific use), while list is more general for more scenario
    
    // ! the difference between LinkedList and ArrayDeque, while using queue interface
    // 1. the underlying data structure

    // ! add and remove from first element and last element
    Deque<String> fruits2 = new LinkedList<>();  // Deque: data structure, LinkedList: implementation
    fruits2.addLast("apple");
    fruits2.addFirst("orange");
    fruits2.addFirst("lemon");
    fruits2.addLast("waterlemon");
    System.out.println(fruits2);
    System.out.println(fruits2.size());
    if (fruits2.contains("orange")) {
      
    }

    List<String> fruits3 = new LinkedList<>();
        
  }
   
}
