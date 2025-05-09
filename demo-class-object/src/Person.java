package src;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height, weight
  // BMI (overweight) -- google calculation

    private double height;
    private double weight;

  // Constructor
    public Person (double height, double weight) {
      this.height = height;
      this.weight = weight;
    } 

  // Empty Constructor
  public Person () {
    this.height = 1.0;
    this.weight = 0.0;
  } 

  public void exercise () {
    this.weight -= 1;
  }

  // ! method
  // BMI -> double
  // isOverWeight -> boolean (bmi > 25)

    public double bmi () {
        return BigDecimal.valueOf(this.weight)
              .divide(BigDecimal.valueOf(this.height).multiply(BigDecimal.valueOf(this.height)), 2, RoundingMode.HALF_DOWN)
              .doubleValue();
    }

    public boolean isOverWeight () {
        if (this.bmi() >= 25.0) {
            return true;
        } else {
            return false;
        }
    }

  // main 
  // Person[] -> p1, p2, p3
  // for loop () -> array -> print out their bmi and weight status
  public static void main(String[] args) {  // main mean test the program 
    Person[] persons = new Person[3];
    persons[0] = new Person(1.75, 70);  //22.85714, persons[0] - object 0
    persons[1] = new Person(1.71, 90);  //30.77870, persons[1] - object 1
    persons[2] = new Person(1.68, 80);  //28.34467, persons[2] - object 2
    
    System.out.println("p1's bmi is " + persons[0].bmi() + '\n' + "is overweighted? " + persons[0].isOverWeight());
    System.out.println("p2's bmi is " + persons[1].bmi() + '\n' + "is overweighted? " + persons[1].isOverWeight());
    System.out.println("p3's bmi is " + persons[2].bmi() + '\n' + "is overweighted? " + persons[2].isOverWeight());
    
    // Person p1 = new Person(1.75, 70);
    // System.out.println(p1.bmi());
    // System.out.println(p1.isOverWeight());

    // Person p2 = new Person();
    // System.out.println(p2.bmi());
    // System.out.println(p2.isOverWeight());
  }   
}
