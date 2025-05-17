package src;

public class Staff {
    private long id;

    public Staff(long id) {
      this.id = id;
    }

    public long getId() {
      return this.id;
    }

    // equals() -> String, Integer, Double
    // author use equal how to define same object 
    // in computer "new" object can use same attributes (e.g. same radius and color). therefore, in computer, using same radius and color can create many objects

    // public boolean equals(Staff staff) {
    //   if (this.id == staff.getId()) {
    //     return true;
    //   }
    //   return false;
    // }
  
    public static void main(String[] args) {
      Staff s1 = new Staff(1L); // real world id is unique but in coding is allowed two objects with one id
      Staff s2 = new Staff(1L);

      if (s1.getId() == 1L) {

      }

      System.out.println(s1.equals(new Staff(1L)));  // suppose true but false now (if we do not rewrite equals() method).  system ask s1 (defined in below void main) = new Staff(1L)
      // ! by default, Java implicity say that equals() checking object's address

      // after rewriting the equals method, new Staff(1) equals new Staff(1)

      String s3 = "hello";
      System.out.println(s3.equals("hello"));

    }
}
