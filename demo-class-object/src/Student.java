package src;

public class Student {
  // hold Candy array
  private String name;
  private Candy[] candies;

  public Student(String name) {
    this.name =  name;
    this.candies = new Candy[0];  // new Candy array without entity
  }

  public String getName() {
    return this.name;
  }

  public Candy[] getCandy() {
    return this.candies;
  }

  public void receive(Candy newCandy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[i] = candies[i];
    }
    newCandies[newCandies.length - 1] = newCandy;
    this.candies = newCandies;
  }

  public static void main(String[] args) {
    // Student s1 = new Student("John");
    // Candy c1 = new Candy("Red", "Chocolate", 10.3);
    // s1.receive(c1);
    // System.out.println(s1.candies[0].getColour());


  }
}
