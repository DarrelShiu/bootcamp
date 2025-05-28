package src;

public class Dog extends Animal {
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public void walk() {
    System.out.println("Bird is walking ...");
}

}