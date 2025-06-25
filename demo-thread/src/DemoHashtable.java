package src;

import java.util.HashMap;
import java.util.Map;

public class DemoHashtable {
  public static void main(String[] args) {
    Map<Integer, String> demoMap = new HashMap<>(); // non-thread safe

    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        demoMap.put(i, "Hello");
      }
    };

    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);
    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException ex) {

    }

    System.err.println(demoMap.size());

  }
}
