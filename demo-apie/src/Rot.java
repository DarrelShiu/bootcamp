package src;

public class Rot extends Machine {
  private String name;
  private int height;

  public Rot(String name, int height, int weight) {
    super(weight); 
    this.name = name;
    this.height = height;
  }

  public Rot(int weight) {
    super(weight);  
  }

  public static void main(String[] args) {
    Rot r1 = new Rot(10);
    System.out.println(r1.getWeight());
  }
}
