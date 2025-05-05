package src;

import java.math.BigDecimal;

// ! Auther
public class Circle {
  private double radius;
  private String colour;
  // private double area; // violate OOP concept

  // Constructor (all args constructor)
  public Circle (double radius, String colour) {
    this.radius = radius;
    this.colour = colour;
  }

  public String getColour() {
    return this.colour;
  }

  public double getRadius() {
    return this.radius;
  }

  // what is the implication of "no setter"
  // 1. we cannot modify the data of object after day1 creation.

  // type of Method: Presenation
  public double diameter() {
    return BigDecimal.valueOf(this.radius)
            .multiply(BigDecimal.valueOf(2.0))
            .doubleValue();
  }

  // type of Method: Presenation
  public double area() {
    return BigDecimal.valueOf(this.radius) //
            .multiply(BigDecimal.valueOf(this.radius))  //
            .multiply(BigDecimal.valueOf(Math.PI))
            .doubleValue(); //
  }

  // ! the user of the Circle class -> 
  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    Circle c2 = new Circle(4.5, "BLUE");
    System.out.println(c1.area());  // 3.5  *3.5 * PI
    System.out.println(c2.area());

    Circle[] circles = new Circle[2];
    circles[0] = c1;
    circles[1] = c2;

    System.out.println(circles[1].getColour());
    System.out.println(c1.area());
    System.out.println(c1.diameter());
    System.out.println(c1.radius);

    // what if we don't backup the circle address
    Circle[] circles2 = new Circle[3];
    circles2[0] = new Circle(9.0, "BLACK");
    circles2[1] = new Circle(2.3, "YELLOW");
    circles2[2] = new Circle(1.9, "PINK");
    System.out.println(circles2[0].getColour());

    // not OOP
    double radius = c1.getRadius();
    double area = BigDecimal.valueOf(radius) //
    .multiply(BigDecimal.valueOf(radius))  //
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

}
