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
}
