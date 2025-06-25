package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoArrayList {

  public static void main(String[] args) {
    // List<Integer> integers = new ArrayList<>();
    List<Integer> integers = new ArrayList<>();

    Runnable task1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        integers.add(1);
      }
    };

    Long before = System.currentTimeMillis();

      Thread worker1 = new Thread(task1);
      Thread worker2 = new Thread(task1);

      worker1.start();
      worker2.start();

      try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }

    Long after = System.currentTimeMillis();

    System.out.println("time used: " + (after - before));

      System.out.println(integers.size());
      
    }

}
