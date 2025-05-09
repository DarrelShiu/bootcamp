package src;

// Customer has many orders
public class Customer {
  private long id;
  private String name;
  private Order[] orders;

  public Customer() {
    this.orders = new Order[0];
  }

  public void add(Order newOrder) {
      Order[] newOrders = new Order[this.orders.length + 1];
      for (int i = 0; i < this.orders.length; i++) {
        newOrders[i] = orders[i];
      }
      newOrders[newOrders.length - 1] = newOrder;
      this.orders = newOrders;
  }

  public double orderAmount() {
    double grandTotal = 0.0;
    for (int i = 0; i < this.orders.length; i++) {
      grandTotal += this.orders[i].checkoutAmount();
    }
    return grandTotal;
  }

  public boolean isVIP() {
    if (orderAmount() > 100_000) {
      return true;
    } else {
      return false;
    }

  }

  // main()
  // John -> many orders -> items
  public static void main(String[] args) {
    Customer john = new Customer();
    Customer peter = new Customer();

    Order orderA = new Order();
    Item ItemA = new Item(100, 2);
    orderA.add(ItemA);
    Item ItemB = new Item(200, 2);
    orderA.add(ItemB);
    // System.out.println(orderA.checkoutAmount());

    Order orderB = new Order();
    Item ItemC = new Item(300, 2);
    orderB.add(ItemC);
    Item ItemD = new Item(400, 2);
    orderB.add(ItemD);

    Order orderC = new Order();
    Item ItemE = new Item(300, 1_000);
    orderC.add(ItemE);
    Item ItemF = new Item(400, 2);
    orderC.add(ItemF);
    orderC.add(ItemA);

    john.add(orderA);
    john.add(orderB);
    john.add(orderC);
    peter.add(orderA);
    peter.add(orderB);

    System.out.println(john.orderAmount());
    System.out.println(peter.orderAmount());

    System.out.println(john.isVIP());
    System.out.println(peter.isVIP());

  }

  // isVIP()
  // total amount of orders -> 100_000

}
