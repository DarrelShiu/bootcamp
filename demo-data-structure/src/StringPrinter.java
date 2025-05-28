package src;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StringPrinter {
  private String value;

  public StringPrinter(String value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);
  }

  public static void main(String[] args) {
    StringPrinter sp = new StringPrinter("hello");
    sp.print; 


  }
}
