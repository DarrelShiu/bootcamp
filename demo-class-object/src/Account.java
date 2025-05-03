package src;

public class Account {
  private String userId;
  private double balance;

  // Constructor
  public Account() { // empty constructor (no parameter)
    // empty 
  }

  public static void main(String[] args) {
    // Object reference: a1, a2
    // "new" -> create an object of Account
    Account a1 = new Account();
    Account a2 = new Account();
  }
}
