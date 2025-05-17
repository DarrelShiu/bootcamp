package src;

public class Test {

  public static int i = 0;
  public static final int j = 0;

  public int getI() {
    return this.i;
  }

  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test();
    System.out.println(t2.i);

    Test.i++;
  }
}
