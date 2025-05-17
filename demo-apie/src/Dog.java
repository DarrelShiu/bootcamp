package src;

public class Dog extends Animal {
  // age...

  private String colour;
  private double weight;

  public Dog(int age, double weight) {
    super(age);
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  @Override
  public int getAge() {
    return -99;
  }

  public static void main(String[] args) {
    Dog dog = new Dog(12, 100.2);
    System.out.println(dog.getAge());
    System.out.println(dog.getWeight());
  }

}
