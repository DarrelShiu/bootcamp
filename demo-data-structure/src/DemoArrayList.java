package src;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] arr = new String[] {"abc", "def", "ghi"};
    for (String s: arr) {
      System.out.println(s);
    }

    // Disadvantages of array
    // 1. fixed length
    // 2. same type of value (Java won't solve this issue)

    // Java allow Object[] to store any type of objects...
    // but Java follow Polymorphism, the allowed methods refers to the type of object reference
    Object[] arr2 = new Object[] {"abc", 10, 9.99};
    for (Object s : arr2) {
      if (s instanceof String) {

      }
    }

    // ArrayList: variable length
    ArrayList<String> names = new ArrayList<String>(); // suppose right hand side String is needed in order to follow the LHS and RHS
    names.add("John");
    names.add("Peter");
    System.out.println(names.size());

    names.remove("Peter");
    System.out.println(names.size());

    names.add("Jennie");
    // Author of ArrayList override toString()
    System.out.println(names);
  
    // ! contains() -> loop & equals()
    if (names.contains("Jennie")) {

    }

    if (!names.contains("Peter")) {

    }

    System.out.println(names.indexOf("John")); // 0
    System.out.println(names.indexOf("Jennie")); // 1
    System.out.println(names.indexOf("Peter")); // -1 (not found)
  
    if (names.isEmpty()) {

    }

    if (names.getFirst() == "Peter") {

    }

    // ! because ArrayList is with ordering
    System.out.println(names.getFirst());
    System.out.println(names.get(1));

    List<String> reversed = names.reversed();
    System.out.println(names.reversed());
    System.out.println(names);

    String oldValue = reversed.set(1, "Steve");
    System.out.println(oldValue);
    System.out.println(reversed);
    
    names.clear();;
    System.out.println(names.isEmpty()); // tue
    System.out.println(names.size()); // 0
    names = null;

    // // remove Dog (equals)
    // List<Dog> dogs = new ArrayList<>();
    // dogs.add(new Dog("Peter"));
    // dogs.add(new Dog("John"));



  }
}
