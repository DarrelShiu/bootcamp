package src;

import java.util.function.Supplier;

public class MethodReference {
  public static void main(String[] args) {
    String name = "John";
    Supplier<Integer> lengthSupplier = () -> name.length();
    int length = lengthSupplier.get();

    Supplier<Integer> lengthSupplier2 = name::length;
    int length2 = lengthSupplier2.get();
  }
}
