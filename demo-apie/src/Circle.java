package src;

import java.math.BigDecimal;

public class Circle extends Shape {
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  @Override
  public double circumference() {
    return BigDecimal.valueOf(2)
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;
    // Object.class has equals(), hashCode(), toString()
    // ! 1. equals()
    System.out.println(o1.equals(o2));  // false
    System.out.println(o1.equals(o3));  // true
    // ! 2. hashCode()
    System.out.println(o1.hashCode());  // 1392838282
    System.out.println(o2.hashCode());  // 523429237
    System.out.println(o3.hashCode());  // 1392838282
    // ! 3. toString() -- object reference
    System.out.println(o1.toString()); // java.lang.Object@5305068a
    System.out.println(o2.toString()); // java.lang.Object@1f32e575
    System.out.println(o3.toString()); // java.lang.Object@5305068a

    Card c1 = new Card('C', 'A');
    Card c2 = new Card('C', 'J');
    System.out.println(c1.equals(c2)); 
    // false, if it is using Object.equals(). we do not override.
    // ! Object.equals() is checking address
    // true, if you re-deifine Card.equals()

    // The definition of hashCode() always same as equals()
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c1 == c2);  // false // ! we can override the definition of equals(), hashCode(), toString()

    Integer x = 8;
   String s1 = new String("hello");
   String s2 = new String("hello");
   System.out.println(s1.equals(s2)); // True // ! primitive use ==
   System.out.println(s1.compareTo(s2));
   System.out.println(x.compareTo(10));
   System.out.println(c1.compareTo(c2));
  }
}
