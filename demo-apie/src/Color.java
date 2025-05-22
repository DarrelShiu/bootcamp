package src;
// ! enum
// ! When you execute the main method, JVM creates enum objects (Color.RED, Color.BLUE) for you automatically
//  RED and BLUE are 2 different and globally unique objects
// enum characteristic: not always change and limit number
//  ! 1. Finite number of values
//  ! 2. Not usually changes (add/ remove) -> program change

public enum Color {
  // private String value; // RED, BLUE
  RED, BLUE;

  // public Color(String value) {
  //   this.value = value;
  // }

  public static void main(String[] args) {
    System.out.println("RED");
    System.out.println("RED");

    System.out.println(Color.BLUE.compareTo(Color.RED));
  }
}
