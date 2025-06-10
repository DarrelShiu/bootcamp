package src;

public class Student { // Outer class
  private Long id;

  // ! Not allowed
  // public String getBookName() {
  //   return name;
  // }

  public Student(Long id) {
    this.id = id;
  }

  public class Book { // Inner class
    private String name;

    public Book(String name) {
      this.name = name;
    }

    public Long getOwnerId() {
      return id;
    }
  }

  public static void main(String[] args) {
    Student s1 = new Student(1L);
    Book b1 = s1.new Book("ABC");  // need to define the relationship between student and book

    System.out.println(b1.getOwnerId());
  }

}
