package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

// ! 1. Less code/class during complie time (StringPrinter, IntegerPrinter)
// ! 2. you still need to define the T type during runtime

// E -> Java for Collection.class
// K,V -> Java for Map
// T,U,V
public class Printer<T> {
  private T value;

  public Printer(T value) {
      this.value = value;
  }

  public void setValue(T value) {
      this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public static void main(String[] args) {
      Printer<String> sp = new Printer<>("ABC");
      Printer<Integer> ip = new Printer<>(123);
      Printer<Double> dp = new Printer<>(10.5);
      
    HashMap<String, List<Dog>> dogMap = new HashMap<>();
    List<Dog> dogList1 = new LinkedList<>();
    dogList1.add(new Dog("John"));
    dogList1.add(new Dog("Peter"));
    dogMap.put("ABC", dogList1);
    List<Dog> dogList2 = new LinkedList<>();
    dogList2.add(new Dog("Lucas"));
    dogList2.add(new Dog("Oscar"));
    dogMap.put("XYZ", dogList2);

    System.out.println(dogMap.get("XYZ").size());
    System.out.println(dogMap.get("XYZ").get(0).getName());

    dogMap.forEach((key, value) -> {
            System.out.println(key + ": ");
            value.forEach(value2 -> System.out.println(value2.getName()));
        });

    Printer<List<Dog>> dogListPrinter = new Printer<>(new LinkedList<>());
    dogListPrinter.getValue().add(new Dog("John"));
    dogListPrinter.getValue().add(new Dog("Peter"));
    

  }
}
