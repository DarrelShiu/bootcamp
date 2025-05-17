package src;

public class DemoStaticMethod {

  private int age;  // attribute getter

  public DemoStaticMethod(int age) {
    this.age =  age;
  }

  public int getAge() {
    return this.age;
  }

  // ! this is called instant method ot object method | Most (90%) of the instant methods are presentation 
  // ! Presentation (Presenting the content of the object)
  // ! instant method needs to use an object 
  public boolean isElderly() {
    return this.age > 65;
  }

  public boolean isChild() {
    return this.age < 18; // definition
  }

  public static boolean isElderly2(int age) {
    return age > 65;
  }

  // why it can be instant method
  public static int sum(int x, int y) { // if every object can use the method -> instant method
    return x + y;
  }

  public static void main(String[] args) {  // static -> no need to use new to call
      DemoStaticMethod dsm = new DemoStaticMethod(10);
      System.out.println(dsm.getAge());
      System.out.println(dsm.isElderly());
      System.out.println(dsm.isChild());

      System.out.println(dsm.getAge() > 65);

      System.out.println(DemoStaticMethod.isElderly2(10));

      System.out.println(DemoStaticMethod.sum(3, 6));

  }
}
