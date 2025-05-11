package src;

public class Candy {
  private static int count = 20;

  // Candy has color, number 
  private long id;
  private String colour;
  private String flavour;
  private double weight;

  // Constructor
  public Candy(String color, String flavour, double weight) {
      this.id = count--;
      this.colour = color;
      this.flavour = flavour;
      this.weight = weight;
  }

  public long getId() {
      return this.id;
  }
  
  public String getColour() {
    return this.colour;
  }

  public String getFlavour() {
    return this.flavour;
  }

  public double getWeight() {
    return this.weight;
  }

  public static void main(String[] args) { // main is the test area

    // Candy c1 = new Candy("Red", "Chocolate", 10.3);
    // Candy c2 = new Candy("Red", "Strawberry", 20.3);
    // Candy c3 = new Candy("Red", "Mango", 30.3);
    // Candy c4 = new Candy("Orange", "Chocolate", 10.3);
    // Candy c5 = new Candy("Orange", "Strawberry", 20.3);
    // Candy c6 = new Candy("Orange", "Mango", 30.3);
    // Candy c7 = new Candy("Yellow", "Chocolate", 10.3);
    // Candy c8 = new Candy("Yellow", "Strawberry", 20.3);
    // Candy c9 = new Candy("Yellow", "Mango", 30.3);
    // Candy c10 = new Candy("Green", "Chocolate", 10.3);
    // Candy c11 = new Candy("Green", "Strawberry", 20.3);
    // Candy c12 = new Candy("Green", "Mango", 30.3);
    // Candy c13 = new Candy("Blue", "Chocolate", 10.3);
    // Candy c14 = new Candy("Blue", "Strawberry", 20.3);
    // Candy c15 = new Candy("Blue", "Mango", 30.3);
    // Candy c16 = new Candy("Purple", "Chocolate", 10.3);
    // Candy c17 = new Candy("Purple", "Strawberry", 20.3);
    // Candy c18 = new Candy("Purple", "Mango", 30.3);
    // Candy c19 = new Candy("Black", "Kiwi", 40.3);
    // Candy c20 = new Candy("Black", "Kiwi", 50.3);





    // Distribute 20 candys to 3 students
    // Every student has his own candies
    // print out the candy (color, number) of every student

    // use loop to distribute the candy

    // if teacher.java -> distribute
    // Student receive (Candy candy) e.g. red 5 candy
    // which object hold attribute 
  }

  // warrior.attack(archer)
  // public void attack (Acher acher) {
  // archer.deductHP(10)}  // object communicate
  // }
}
