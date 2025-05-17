package src;

public class Child {
  // ! static -> common attribute, NOT belongd to any objects
  // ! but all objects can access the static variable
  private static int counter = 0; // if add static 

  // Every Child object has id, firstName and lastName. But no counter.
  // Attribute (Instance variable)
  // Instant = Object
  private String hkid;
  private long id;
  private String firstName;
  private String lastName;

  // Constructor
  public Child(String firstName, String lastName) {
    counter++;
    this.id = counter;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // Getter
  public long getID() {
    return this.id;
  }
  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getHKID() {
    return this.hkid;
  }

  // ! Rewrite the defintion of Child in your world
  // ! if has id, no need to use this equals
  // public boolean equals(Child child) {
  //   return this.firstName.equals(child.getFirstName())   // this refer to c1
  //       && this.lastName.equals(child.getLastName());   
  // }

  public boolean equals(Child child) {
    return this.id == child.getID();   
  }

  // public boolean equals(Child child) {
  //   return this.hkid.equals(child.getHKID());   
  // }

  public static void main(String[] args) {
    Child c1 = new Child("Leo", "Chan");
    
    // Approach1
    if (c1.getFirstName().equals("leo") && c1.getLastName().equals("Chan")) {
      System.out.println("He is Leo Chan");
    }

    // Approach2
    System.out.println(c1.equals(new Child("Leo", "Chan")));
    System.out.println(c1.equals(new Child("Leo", "Lau")));
    System.out.println(c1.equals(new Child("Peter", "Lau")));    
    System.out.println(c1.equals(new Child("Peter", "Chan")));    

    Child c2 = new Child("Leo", "Wong");
    Child c3 = new Child("Leo", "Wong");
    System.out.println(c2.getID());
    System.out.println(c3.getID());
    System.out.println(c2.equals(new Child("Leo", "Wong"))); // if you used id for identification, why still use another way for identify
    // System.out.println(c2.equals("6"));

  }
  
}
