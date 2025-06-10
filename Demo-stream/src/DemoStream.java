package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class DemoStream {

  public static void main(String[] args) {

    List<Dog> dogs = new ArrayList<>(Arrays.asList(new Dog("ABC", 10),
        new Dog("DEFO", 7), new Dog("LJK", 8)));

    List<Dog> newDogs = new ArrayList<>();

    for (int i = 0; i < dogs.size(); i++) {
      if (dogs.get(i).age >= 8) {
        newDogs.add(dogs.get(i));
      }
    }

    System.out.println(newDogs);

    // ! Stream
    // List<Dog> newDogs2 = dogs.stream()
    Stream<Dog> newDogs2 = dogs.stream();
    Stream<Dog> newDogs3 = newDogs2.filter(d -> d.getAge() >= 8);
    List<Dog> newDogs4 = newDogs3.collect(Collectors.toList());
    System.out.println(newDogs4);

    List<Dog> newDogs5 =
        dogs.stream().filter(d -> d.getAge() >= 8).collect(Collectors.toList());
    System.out.println(newDogs5);

    List<Dog> newDogs6 = dogs.stream().filter(d -> d.getName().charAt(0) == 'D')
        .collect(Collectors.toList());
    System.out.println(newDogs6);

    List<Dog> newDogs7 =
        dogs.stream().filter(d -> d.getName().length() > 3 && d.getAge() < 8)
            .collect(Collectors.toList());
    System.out.println(newDogs7);

    List<String> dogsName = new ArrayList<>();
    for (int i = 0; i < dogs.size(); i++) {
      dogsName.add(dogs.get(i).getName());
    }
    System.out.println(dogsName);

    List<String> dogsName2 =
        dogs.stream().map(d -> d.getName()).collect(Collectors.toList());
    System.out.println(dogsName2);

    List<String> dogsName3 = dogs.stream().filter(d -> d.getAge() > 9)
        .map(d -> d.getName()).collect(Collectors.toList());
    System.out.println(dogsName3);

    List<Staff> staffs = new ArrayList<>();
    staffs.add(new Staff("john", LocalDate.of(2022, 1, 20), "john@gmail.com"));
    staffs.add(new Staff("mary", LocalDate.of(2024, 12, 30), "mary@gmail.com"));
    staffs.add(new Staff("alex", LocalDate.of(2010, 1, 1), "alex@gmail.com"));

    staffs.stream().filter(s -> s.yearOfExp() > 10).map(s -> s.getEmail())
        .forEach(email -> {
          System.out.println("Email address: " + email);
        });

    Comparator<Staff> sortByYearOfExp =
        (staff1, staff2) -> staff1.yearOfExp() < staff1.yearOfExp() ? -1 : 1;
    List<String> emails = staffs.stream() //
        .sorted(sortByYearOfExp).map(s -> s.getEmail())
        .collect(Collectors.toList());
    System.out.println(emails);

    StringLengthFormula testString = new StringLengthFormula();
    System.out.println(testString.apply("aaaaaaa"));

    // Given: List<String>, Vincent, Lucas, Oscar
    // Output: List<Dog>, assume all dogs are at age 1
    List<Dog> dog3 = new ArrayList<>(Arrays.asList(new Dog("ABC", 10), new Dog("DEFO", 7), new Dog("LJK", 8)));
    List<Dog> dog4 = dog3
        .stream()
        .filter(d -> d.getAge() > 7)
        .collect(Collectors.toList());
    
    System.out.println(dog4);


  }

  public static class Staff {
    private String name;
    private LocalDate joinDate;
    private String email;

    public Staff(String name, LocalDate joinDate, String email) {
      this.name = name;
      this.email = email;
      this.joinDate = joinDate;
    }

    public String getEmail() {
      return this.email;
    }

    public int yearOfExp() {
      return LocalDate.now().getYear() - this.joinDate.getYear();
    }
  }

  public static class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Dog name: " + this.name + "/ age: " + this.age;
    }
  }

}
