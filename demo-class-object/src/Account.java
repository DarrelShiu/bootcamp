package src;

public class Account {
  private String userId;
  private double balance;

  // ! can be more than 1 constructors
  // Constructor (no return type -> regard as a constructor)
  public Account() { // empty constructor (no parameter)
    this.balance = 10.0;
  }

  // technical ok
  // public Account(String userId) { // empty constructor (no parameter)
  //   this.userId = userId;
  // }

  // All arguments constructor (All parameters)
  public Account(String userId, double balance) {
    this.userId = userId;
    this.balance = balance;
  }

  public void setUserId (String userId) {
    this.userId = userId;
  }

  public String getUserId() {
    return this.userId;
  }

  // ! write
  public void setBalance(double balance) { // the blueprint for main
    this.balance = balance; // since there is nothing to return -> void
  }

  //  ! read
  public double getBalance() {  // the blueprint for main
    return this.balance;  // double (return type) = return type must match
  }

  public static void main(String[] args) {
    Account[] accounts = new Account[3]; // create Account Array Object (store address to refer to object)
    Account a1 = new Account();
    Account a2 = new Account();
    a2.setBalance(800.0);
    Account a3 = new Account();
    accounts[0] = a1;
    accounts[1] = a2;
    accounts[2] = a3;

    String[] names = new String[3];
    String s1 = "john";
    String s2 = "peter";
    String s3 = "sally";
    names[0] = s1;

    System.out.println(names[0].length());

    System.out.println(accounts[1].getBalance());


  }

}
