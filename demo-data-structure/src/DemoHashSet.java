package src;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("John");
    strings.add("Peter");
    strings.add("Tom");
    System.out.println(strings.size());
    System.out.println(strings);

    strings.remove("Peter");

    // The difference between ArrayList and HashSet
    // 1. No ordering
    // 2. Naturally avoid duplicated values

    boolean result = strings.add("Mary");
    // boolean result = strings.add("John");
    System.out.println(result);
    System.err.println(strings);

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("apple");
    fruits.add("lemon");
    int fruitLength = fruits.size();
    
    HashSet<String> fruit2 = new HashSet<>();
    fruit2.add("apple");
    System.out.println(fruit2.add("apple"));
    fruit2.add("orange");
    fruit2.add("apple");
    System.out.println(fruit2.add("apple"));
    fruit2.add("pine");
    System.out.println(fruit2.add("pine"));
    fruit2.add("lemon");
    int frunit2Length = fruit2.size();
    System.out.println(fruit2);

    boolean noDuplicate = fruitLength == frunit2Length;

    System.out.println(noDuplicate);

    // loop + hashset + add()
    boolean foundDuplicated = false;
    HashSet<String> fruitSet = new HashSet<>();
    for (String fruit : fruits) {
      if(!fruitSet.add(fruit)) {
        foundDuplicated = true;
        break;
      }
    }

  }
}
