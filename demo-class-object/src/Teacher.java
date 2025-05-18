package src;

public class Teacher {

  private String name;
  private static int counter = 20;
  private Candy[] candies = new Candy[counter];

  public Teacher(String name) {
    this.name = name;
  }

  public void inPocket() {
    candies[19] = new Candy("Red", "Chocolate", 10.3);
    candies[18] = new Candy("Red", "Strawberry", 20.3);
    candies[17] = new Candy("Red", "Mango", 30.3);
    candies[16] = new Candy("Orange", "Chocolate", 10.3);
    candies[15] = new Candy("Orange", "Strawberry", 20.3);
    candies[14] = new Candy("Orange", "Mango", 30.3);
    candies[13] = new Candy("Yellow", "Chocolate", 10.3);
    candies[12] = new Candy("Yellow", "Strawberry", 20.3);
    candies[11] = new Candy("Yellow", "Mango", 30.3);
    candies[10] = new Candy("Green", "Chocolate", 10.3);
    candies[9] = new Candy("Green", "Strawberry", 20.3);
    candies[8] = new Candy("Green", "Mango", 30.3);
    candies[7] = new Candy("Blue", "Chocolate", 10.3);
    candies[6] = new Candy("Blue", "Strawberry", 20.3);
    candies[5] = new Candy("Blue", "Mango", 30.3);
    candies[4] = new Candy("Purple", "Chocolate", 10.3);
    candies[3] = new Candy("Purple", "Strawberry", 20.3);
    candies[2] = new Candy("Purple", "Mango", 30.3);
    candies[1] = new Candy("Black", "Kiwi", 40.3);
    candies[0] = new Candy("Black", "Kiwi", 50.3);
  }

  public Candy distributeCandies() {
    counter--;
    return candies[counter];
  }

  public void deductCandies() {
    candies[counter] = null;
  }

  public static void main(String[] args) {

    int j = 0;
    Teacher t1 = new Teacher("Mary");
    Student s1 = new Student("John");
    Student s2 = new Student("Peter");
    Student s3 = new Student("Tom");

    // Generate candies in teacher
    t1.inPocket();

    // Teacher distribute candies
    for (int i = 1; i < 8; i++) {
      if (j == 20) {
        break;
      } 
      s1.receive(t1.distributeCandies());
      t1.deductCandies();
      j += 1;
      if (j == 20) {
        break;
      } 
      s2.receive(t1.distributeCandies());
      t1.deductCandies();
      j += 1;
      if (j == 20) {
        break;
      } 
      s3.receive(t1.distributeCandies());
      t1.deductCandies();
      j += 1;
    }
    
    // Check student's pocket
    // for (int i = 0; i < s1.getCandy().length; i++) {
    //   System.out.println("Name: " + s1.getName() + " ID: " + s1.getCandy()[i].getId() + " Colour: " + s1.getCandy()[i].getColour() + " Flavour: " + s1.getCandy()[i].getFlavour() + " Weight: " + s1.getCandy()[i].getWeight());
    // }
    // for (int i = 0; i < s2.getCandy().length; i++) {
    //   System.out.println("Name: " + s2.getName() + " ID: " + s2.getCandy()[i].getId() + " Colour: " + s2.getCandy()[i].getColour() + " Flavour: " + s2.getCandy()[i].getFlavour() + " Weight: " + s2.getCandy()[i].getWeight());
    // }
    // for (int i = 0; i < s3.getCandy().length; i++) {
    //   System.out.println("Name: " + s3.getName() + " ID: " + s3.getCandy()[i].getId() + " Colour: " + s3.getCandy()[i].getColour() + " Flavour: " + s3.getCandy()[i].getFlavour() + " Weight: " + s3.getCandy()[i].getWeight());
    // }

    for (int i = 0; i < s1.getCandy().length; i++) {
      if (s1.getCandy()[i].getColour() == "Red") {
        System.out.println("Name: " + s1.getName() + " ID: " + s1.getCandy()[i].getId() + " Colour: " + s1.getCandy()[i].getColour() + " Flavour: " + s1.getCandy()[i].getFlavour() + " Weight: " + s1.getCandy()[i].getWeight());
      }
    }

    for (int i = 0; i < s2.getCandy().length; i++) {
      if (s2.getCandy()[i].getColour() == "Red") {
        System.out.println("Name: " + s2.getName() + " ID: " + s2.getCandy()[i].getId() + " Colour: " + s2.getCandy()[i].getColour() + " Flavour: " + s2.getCandy()[i].getFlavour() + " Weight: " + s2.getCandy()[i].getWeight());
      }
    }

    for (int i = 0; i < s3.getCandy().length; i++) {
      if (s3.getCandy()[i].getColour() == "Red") {
        System.out.println("Name: " + s3.getName() + " ID: " + s3.getCandy()[i].getId() + " Colour: " + s3.getCandy()[i].getColour() + " Flavour: " + s3.getCandy()[i].getFlavour() + " Weight: " + s3.getCandy()[i].getWeight());
      }
    }

    System.out.println(s1.getCandy().length);
    System.out.println(s2.getCandy().length);
    System.out.println(s3.getCandy().length);


    // for (int i = 0; i < 20; i++) {
    //   System.out.println(t1.candies[i]);
    // }    
    
  }
}
