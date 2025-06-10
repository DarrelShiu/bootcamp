package src;

import java.util.*;

public class DemoSwitchExpression {
  
  public static void main(String[] args) {

    Currency currency = Currency.USD;
    if (currency == Currency.HKD) {

    } else if (currency == Currency.USD) {

    } else if (currency == Currency.CNY) {

    }

    switch (currency) {
      case HKD -> System.out.println("Hong Kong");
      case USD -> System.out.println("USA");
      case CNY -> System.out.println("China");
    }

  }
  
  public static enum Currency {
    HKD, USD, CNY,;
  }
  
}
