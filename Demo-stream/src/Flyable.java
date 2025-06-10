package src;

import java.util.LinkedList;
import java.util.List;

public interface Flyable {
  void fly();

  // ! We need to create a class to implement Flayable (how to fly)
  // ! so that we can use the object of the class to invoke fly() method

  public static void main(String[] args) {
    Flyable superman1 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("superman is flying...");
        }
    };

    // this object is for one-off usage
    // Not intend to resue it
    superman1.fly();  

    Flyable superman2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("superwoman is flying...");
        }
    };

    // this object is for one-off usage
    // Not intend to resue it
    superman2.fly();  

    List<Flyable> flyableObject = new LinkedList<>();
    flyableObject.add(superman1);
    flyableObject.add(superman2);

  }
}
