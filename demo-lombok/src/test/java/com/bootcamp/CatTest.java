package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CatTest {
  @Test
  void testCatGetter() {
    Cat c1 = new Cat("John", 3);
    assertEquals("John", c1.getName());
    assertEquals(3, c1.getAge());
  }
}
