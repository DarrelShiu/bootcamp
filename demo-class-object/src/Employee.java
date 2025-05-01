package src;

public class Employee {
  // Attributes
  private String name;
  private int age;
  private String email;

  // Object Method (Instant Method)
  public void setName(String name) { // void suppose set no need to return
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

    // Object Method (Instant Method)
    public void setAge(int age) {
      this.age = age;
    }
  
    public String getAge() {
      return String.valueOf(this.age);
    }

        // Object Method (Instant Method)
        public void setEmail(String email) {
          this.email = email;
        }
      
        public String getEmail() {
          return this.email;
        }

  // Runtime
  public static void main(String[] args) {
    // Problem
    String employee1Name = "John";
    int employee1Age = 26;
    String employee1Email = "john@gmail.com";

    String employee2Name = "Steven";
    int employee2Age = 30;
    String employee2Email = "steven@gmail.com";

    // Solution - Class and Object
    
    // employee e1
    Employee e1 = new Employee();  // new object in Heap Address then e1 in Stack Memory set address to a new address (new object)
    e1.setName("John");  // call e1's method setname
    e1.setAge(26);
    e1.setEmail("john@gmail.com");

    // employee e2
    Employee e2 = new Employee();
    e2.setName("Sally");  // call e2's method setname
    e2.setAge(30);
    e2.setEmail("sally@gmail.com");

    System.out.println(e1.getName());  // John
    System.out.println(e1.getAge());
    System.out.println(e1.getEmail());
    System.out.println(e2.getName());  // Sally
    System.out.println(e2.getAge());
    System.out.println(e2.getEmail());

    // e1 = e2;  // e1 point to e2 now, if no address is pointed to e1, auto cabbage delete 
    // System.out.println(e1.getname());  // Sally
    // System.out.println(e2.getname());  // Sally
  }
}
