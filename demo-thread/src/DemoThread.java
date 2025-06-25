package src;

import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread {
  private int x;
  private AtomicInteger y = new AtomicInteger();

  public synchronized void addOne() {
    this.x++;
  }

  public void eat() {
    y.getAndIncrement();
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y.get();
  }

  public static void main(String[] args) {
    DemoThread demoThread = new DemoThread();

    Runnable task1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        demoThread.addOne();
      }
    };

    // main thread
    Thread worker1 = new Thread(task1);  // create thread 1
    Thread worker2 = new Thread(task1); // create thread 2

    worker1.start();  // inform worker 1 to start working
    worker2.start();
    
    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {
      
    }

    System.out.println(demoThread.getX());

    
  }
}


// stack - thread safe
// Vector - thread safe