package src;

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
  }
}
