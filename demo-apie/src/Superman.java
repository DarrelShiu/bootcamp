package src;

public class Superman extends Human implements Flyable{

  private String name;
  
  public Superman(String name) {
    // this.name = name;
    super(name);
  }

  @Override
  public void fly() {
    System.out.println("I am flying ...");
  }

  public void eat() {
    System.out.println("I am eating ...");
  }

  public static void main(String[] args) {
    Superman s1 = new Superman();
    s1.fly();

    Flyable something = new Superman("Peter");
    something.fly();

    // hide the method of eat()
    // something.eat()

    Superman s2 = (Superman) something;
    s2.eat();
  }
}
