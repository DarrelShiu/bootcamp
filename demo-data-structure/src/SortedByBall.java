package src;

import java.util.Comparator;
import src.Ball.Color;

public class SortedByBall implements Comparator<Ball> {

  // YELLOW -> RED -> BLUE
  @Override
  public int compare(Ball b1, Ball b2) {
    
    if (b1.getColor() != b2.getColor()) {
      if (b1.getColor() == Ball.Color.YELLOW)
        return -1;
      if (b2.getColor() == Ball.Color.YELLOW)
        return 1;
      if (b1.getColor() == Ball.Color.RED)
        return -1;
      if (b2.getColor() == Ball.Color.RED)
        return 1;
      if (b1.getColor() == Ball.Color.BLUE)
        return -1;
      if (b2.getColor() == Ball.Color.BLUE)
        return 1;
      return -1;
    } else  {
      return -(b1.getNum() - b2.getNum());
    }
  }
}
