package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class DataStructureExercise {
  public static void main(String[] args) {
     // Exercise 1: Array List Basic Operations
    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    System.out.println("Exercise 1 ans:");
    ArrayList<Integer> arrList1 = new ArrayList<>();
    arrList1.add(10);
    arrList1.add(20);
    arrList1.add(30);
    arrList1.add(40);
    arrList1.add(50);
    System.out.println(arrList1);
    arrList1.remove(2);
    // System.out.println(arrList1);
    System.out.println(arrList1.size());

     // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    System.out.println("Exercise 2 ans:");
    ArrayList<String> arrList2 = new ArrayList<>();
    arrList2.add("Apple");
    arrList2.add("Banana");
    arrList2.add("Mango");
    arrList2.add("Orange");
    for (int i = 0; i < arrList2.size(); i++) {
      if (arrList2.indexOf("Grapes") == -1) {
        arrList2.add("Grapes");
      }
    }
    // System.out.println(arrList2);
    arrList2.set(arrList2.indexOf("Mango"), "Peach");
    System.out.println(arrList2);

    // Exercise 3: Remove Duplicates
    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    System.out.println("Exercise 3 ans:");
    ArrayList<Integer> arrList3 = new ArrayList<>();
    arrList3.add(10);
    arrList3.add(20);
    arrList3.add(10);
    arrList3.add(30);
    arrList3.add(40);
    arrList3.add(20);
    arrList3.add(50);
    Set<Integer> set1 = new HashSet<>(arrList3);
    System.out.println(set1);

    // Exercise 4: HashSet Basic Operations
    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    System.out.println("Exercise 4 ans:");
    HashSet<String> set2 = new HashSet<>();
    set2.add("USA");
    set2.add("India");
    set2.add("China");
    set2.add("Japan");

    set2.add("Canada");
    set2.add("India");
    System.out.println(set2);

    // Exercise 5: Check the numbers
    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    System.out.println("Exercise 5 ans:");
    boolean isExist;
    Set<Float> set3 = new HashSet<>();
    set3.add(1.1f);
    set3.add(2.2f);
    set3.add(3.3f);
    set3.add(4.4f);
    set3.add(5.5f);
    isExist = set3.contains(3.3f);
    System.out.println(isExist);
    set3.remove(2.2f);
    System.out.println(set3);
    System.out.println(set3.size());

    // Exercise 6: Intersection of Sets
    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    System.out.println("Exercise 6 ans:");
    Set<Integer> set4 = new HashSet<>();
    Set<Integer> set5 = new HashSet<>();
    set4.add(10);
    set4.add(20);
    set4.add(30);
    set4.add(40);
    set5.add(30);
    set5.add(40);
    set5.add(50);
    set5.add(60);
    set4.addAll(set5);
    System.out.println(set4);

    // Exercise 7: Convert HashSet to ArrayList
    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    System.out.println("Exercise 7 ans:");
    HashSet<String> set6 = new HashSet<>();
    set6.add("Cherry");
    set6.add("Steve");
    set6.add("Chole");
    set6.add("Jenny");
    set6.add("Vicky");
    // System.out.println(set6);
    ArrayList<String> arrList4 = new ArrayList<>(set6);
    System.out.println(arrList4);


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    System.out.println("Exercise 8 ans:");
    ArrayList<Student> arrStudent = new ArrayList<>(Arrays.asList(new Student("Alice"), new Student("Bob"), new Student("Charlie"), new Student("Tom"), new Student("Apple")));
    for (int i = 0; i < arrStudent.size(); i++) {
      System.out.print("ID: " + arrStudent.get(i).getId() + ", ");
      System.out.println("Name: " + arrStudent.get(i).getName());
    }

    for (int i = 0; i < arrStudent.size(); i++) {
      if (arrStudent.get(i).getName() == "Tom") {
        arrStudent.remove(i);
      }
    }
  
    for (int i = 0; i < arrStudent.size(); i++) {
      System.out.print("ID: " + arrStudent.get(i).getId() + ", ");
      System.out.println("Name: " + arrStudent.get(i).getName());
    }

    System.out.println(studentName(arrStudent, 3));

    ArrayList<Student> arrStudentA = new ArrayList<>();
    for (int i = 0; i < arrStudent.size(); i++) {
      if (arrStudent.get(i).getName().charAt(0) == 'A') {
          arrStudentA.add(arrStudent.get(i));
      }
    }

    // System.out.println(arrStudentA.size());
    // for (int i = 0; i < arrStudentA.size(); i++) {
    //   System.out.print("ID: " + arrStudentA.get(i).getId() + ", ");
    //   System.out.println("Name: " + arrStudentA.get(i).getName());
    // }

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    System.out.println("Exercise 9 ans:");
    ArrayList<Student> arrStudent2 = new ArrayList<>(Arrays.asList(new Student("Alice"), new Student("Bob"), new Student("Charlie")));
    ArrayList<Student> arrStudent3 = new ArrayList<>(Arrays.asList(arrStudent2.get(1), arrStudent2.get(2), new Student("David")));
    HashSet<Student> set10 = new HashSet<>(arrStudent2);
    HashSet<Student> set11 = new HashSet<>(arrStudent3);
    set10.addAll(set11);
    
    for (Student s : set10) {
      System.out.println(s.getName());
    }

  }

  public static class Student {
    private int id;
    private String name;
    private static int count = 1;

    // Constructor
    // getter, setter, etc.
    public Student(String name) {
      this.id = count++;
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public int getId() {
      return this.id;
    }
  }

  public static String studentName(ArrayList<Student> arrStudent, int id) throws NullPointerException {
    Student target = null;
    for (Student s : arrStudent) {
      // if (s.id == id) 
      // target = s;

      if (s.getId() == id) {
        target = s;
      } 
  
    } 

    if (target == null) {
       throw new NullPointerException("Student not found");
      }
    return target.getName();

  }

}
