package src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Test {

  public static void main(String[] args) {

    for(int i = 0; i < 10; i++) {
        // System.out.println(i);
    }

    int[] arrInt = new int[] {1, 2, 3};
    for (int i : arrInt) {
      // System.out.println(i);
    }

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    int removedNumber = numbers.remove(1); // numbers: [10], removedNumber: 20
    // System.out.println(numbers);
    // System.out.println(removedNumber);

    List<Integer> arrInt2 = List.of(1, 2, 3);
    arrInt2.forEach(s -> System.err.println(s));

    ArrayList<String> strings = new ArrayList<>(Arrays.asList("tom"));

    HashMap<Integer, String> studentMap = new HashMap<>();
    studentMap.put(1, "Alice");
    studentMap.put(2, "Bob");
    Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();

    for (Map.Entry<Integer, String> entry : entries) {
    int key = entry.getKey();
    String value = entry.getValue();
    // System.out.println("Key: " + key + ", Value: " + value);
    }


    Stack<Integer> stack = new Stack<>();
    stack.add(10);

    Stack<Integer> otherStack = new Stack<>();
    otherStack.add(20);
    otherStack.add(30);

    stack.addAll(otherStack);

    // System.out.println(stack.getFirst());
    //  System.out.println(stack.getLast());
    //  System.out.println(stack.firstElement());
    //  System.out.println(stack.lastElement());

      Stack<Integer> stack1 = new Stack<>();
       stack1.push(10);
       stack1.push(20);
       stack1.push(30);
    //    System.out.println(stack1.getFirst());
    //  System.out.println(stack1.getLast());

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the front and back of the deque
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);
        deque.addLast(40);
        deque.addLast(50);

        // System.out.println(deque.getFirst());


        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        
        // Lambda Expression
        Comparator<Integer> descending = (x, y) -> y > x ? 1 : -1; // descending
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(descending);
        priorityQueue2.add(10);
        priorityQueue2.add(120);
        priorityQueue2.add(40);
        for (int i : priorityQueue2) {
          System.out.println(i);
        }
  
  }

 
  
}


