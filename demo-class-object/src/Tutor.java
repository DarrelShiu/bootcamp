package src;

public class Tutor {
  public static void main(String[] args) {  // main is the area to create objects
    // Object reference: a1, a2
    // "new" -> create an object of Account
    Account a1 = new Account();  // when press run -> start from here; a1 is called object reference(address)/ variable, "a1." can image a1 go to 
    a1.setBalance(100.0);
    System.out.println(a1.getBalance());
    
    Account a2 = new Account();
    a2.setBalance(200.0);
    System.out.println(a2.getBalance());

    a2 = a1; // put a1 address to a2 -> a2 will be recycled
    a2.setBalance(500.0);
    System.out.println(a1.getBalance());
    System.out.println(a2.getBalance());

    Account a3 = new Account("johnwong", 900.0);
    System.out.println(a3.getUserId());
    System.out.println(a3.getBalance());

    // Local variable -> Local
    String userId = "123";
    System.out.println(userId);

  }
}
