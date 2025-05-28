package src;

public class IntegerPrinter {
  private int value;

  public IntegerPrinter(int value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);
  }

  public static void main(String[] args) {
    IntegerPrinter ip = new IntegerPrinter(10);
    ip.print; 
  }
}
