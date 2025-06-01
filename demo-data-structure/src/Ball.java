package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class Ball {
  private Color color;
  private Integer number;

  public Ball(Color color, Integer number) {
    this.color = color;
    this.number = number;
  }

  public Color getColor() {
    return this.color;
  }

  public Integer getNum() {
    return this.number;
  }

  public static enum Color {
    RED, BLUE, YELLOW,;
  }

  @Override
  public String toString() {
    return "Ball("
      + "color=" + this.color
      + ")"
      + ","
      + "num=" + this.number;
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.RED, 23));
    balls.add(new Ball(Color.BLUE, 2));
    balls.add(new Ball(Color.YELLOW, 5));
    balls.add(new Ball(Color.BLUE, 7));
    balls.add(new Ball(Color.RED, 1000));
    balls.add(new Ball(Color.BLUE, 59));
    balls.add(new Ball(Color.YELLOW, 9));
    balls.add(new Ball(Color.BLUE, 10));

    // Arrays.sort() -> sort array

    // sort List
    Collections.sort(balls, new SortedByBall());
    System.out.println(balls);

    // balls.sort(Comparator.comparing(Ball::getColor, (s1, s2) -> {return s2.compareTo(s1);})
    //                       .thenComparing(Ball::getNum));
    // System.out.println(balls);

    // SortByBall.java
    // YELLOW -> RED -> BLUE

    // Assignment: SortByBall2.java
    // Sort color first, if color is same, larger number goes first.
    // YELLOW,9 -> YELLOW,5 -> RED,1000 -> BLUE,10 -> BLUE, 2
  }
}
