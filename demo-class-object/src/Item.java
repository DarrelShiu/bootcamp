package src;

public class Item {
  private double price;
  private int quantity;

  public Item(double price, int quantity) {  // a set of data
    this.price = price;
    this.quantity = quantity;
  }

  // BigDecimal
  public double subtotal() {
    return this.price * this.quantity;
  }

  // setter -> setquantity

  // ! the ways of access the object's content
  public void add() {
    this.quantity += 1;
  }

  public boolean deduct() {
    if (this.quantity > 0) {
      this.quantity -= 1;
      return true;
    } else {
      return false;
    }
  }

  public int getQuantity() {
    return this.quantity;
  }

  public static void main(String[] args) {
    Item itemA = new Item(99.0, 1);
    itemA.add();
    itemA.add();
    itemA.deduct();
    itemA.deduct();
    itemA.deduct();
    itemA.deduct();
    System.out.println(itemA.getQuantity());  // 2
  }

}
