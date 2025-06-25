package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Cat {
  private String name;
  private int age;

  // public Cat(String name, int age, double weight) {
  //   super(weight);
  //   this.name = name;
  //   this.age = age;
  // }

  public static void main(String[] args) {
    Cat cat1 = new Cat("John", 2);
    Cat cat2 = new Cat();

    System.out.println(cat1.getName());
    System.out.println(cat1.getAge());
    System.out.println(cat1);

    cat2.setAge(7);
    cat2.setName("Peter");

    System.out.println(cat2.getName());
    System.out.println(cat2.getAge());

    Cat cat3 = new Cat("John", 2);
    System.out.println(cat1.equals(cat3));
    System.out.println(cat1.hashCode() == cat3.hashCode());


  }

}
