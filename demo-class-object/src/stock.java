package src;

import java.time.LocalDate;

public class Stock {

  private String stockNumber = "0000";
  private String stockName = "ABC";
  private double endOfDayPrice = 0.00d;
  private LocalDate buyDate = LocalDate.now();
  private LocalDate sellDate = LocalDate.now();

  public void setStock (String stockName, String stockNumber, double price, LocalDate buyDate, LocalDate sellDate) {
    this.stockName = stockName;
    this.stockNumber = stockNumber;
    this.endOfDayPrice = price;
    this.buyDate = buyDate;
    this.sellDate = sellDate;
  }

  public String getStockNumber () {
    return this.stockNumber;
  }

  public String getStockName () {
    return this.stockName;
  }

  public double getStockPrice () {
    return this.endOfDayPrice;
  }

  public LocalDate getBuyDate () {
    return this.buyDate;
  }

  public LocalDate getSellDate () {
    return this.sellDate;
  }

  public static void main(String[] args) {
    Stock stock1 = new Stock();
    Stock stock2 = new Stock();

    stock1.setStock("12345", "ACB company", 3.125, LocalDate.now().plusDays(-1), LocalDate.now());
    stock2.setStock("12346", "AC co", 4.666, LocalDate.now().plusDays(-10), LocalDate.now());
    System.out.println(stock1.getStockNumber());
    System.out.println(stock1.getStockName());
    System.out.println(stock1.getStockPrice());
    System.out.println(stock1.getBuyDate());
    System.out.println(stock1.getSellDate());

  }
}
