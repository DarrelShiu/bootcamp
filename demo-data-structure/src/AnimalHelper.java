package src;
// ! <T extends Animal>, means T can be Animal, pr its child class
public class AnimalHelper<T extends Animal> {
  private T animal;

  public void setAnimal(T animal) {
    this.animal =  animal;
  }

  // in static method, any generic type is independent
  // not referring to the class T
  public static <U extends Animal> void walk(U animal) {
    animal.walk(); // polymorphism, because "extends Animal" ensure object can call Animal method
  }

  public static void main(String[] args) {
    AnimalHelper<Animal> animalHelper1 = new AnimalHelper<>();
    animalHelper1.setAnimal(new Bird());
    animalHelper1.setAnimal(new Dog("John"));

    AnimalHelper<Dog> animalHelper2 = new AnimalHelper<>();
    animalHelper2.setAnimal(new Dog("Peter"));

    AnimalHelp2 superHelper = new AnimalHelp2();

    
  }

}
