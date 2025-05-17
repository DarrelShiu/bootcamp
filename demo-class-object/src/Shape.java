package src;

public class Shape {

  private static int counter = 0; // object can approach
  private static final double PI = 3.14159; // "static final" -> constant
  private final String name = "John"; // every object has John
  private String colour; // attribute (usually we have setter, because it is not final)
  
  // final -> finalised
  // static vs static final -> static can be modified

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println(Shape.PI); // 3.14159
    // ! because Shape.PI us a 'final' variable, so cannot be modified.
    // Shape.PI += 1; -> cannot be assigned

    Shape.counter++;
    System.out.println(Shape.counter);

    new Shape().counter++; // not recommend // object can find variable 
    Shape.counter++ ; // normal usage
    System.out.println(Shape.counter);

    // print John
    Shape cs1 = new Shape();
    System.out.println(s1.getName());

    System.out.println(new Shape().getName());  // create and then kill. if keep, use s2 variable to store

  }
}
