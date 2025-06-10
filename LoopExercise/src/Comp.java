package src;

import java.util.Comparator;

public class Comp implements Comparator<Integer> {

  @Override
  public int compare(Integer a, Integer b) {
        // return a.compareTo(b);
        return a > b ? -1 : 1;
    }
}

