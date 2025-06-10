package src;

public class Burger {
  private String bun;
  private String meat;
  private String salad;
  private String cheese;
  private String sauce;

  private Burger(Builder builder) {
    this.bun = builder.bun;
    this.meat = builder.meat;
    this.salad = builder.salad;
    this.cheese = builder.cheese;
    this.sauce = builder.sauce;
  }

  public static Burger.Builder builder() {
    return new Burger.Builder();
  }

  // Getters and Setters here ...

  public static class Builder {
    private String bun;
    private String meat;
    private String salad;
    private String cheese;
    private String sauce;

    public Builder bun(String bun) {
      this.bun = bun;
      return this;
    }

    public Builder meat(String meat) {
      this.meat = meat;
      return this;
    }

    public Builder salad(String salad) {
      this.salad = salad;
      return this;
    }

    public Builder cheese(String cheese) {
      this.cheese = cheese;
      return this;
    }

    public Builder sauce(String sauce) {
      this.sauce = sauce;
      return this;
    }

    public Burger build() {
      return new Burger(this);
    }
  }

  public static void main(String[] args) {
    // Simple static method in Burger class, return static nested class object
    Burger burger = Burger.builder() 
        .bun("White Bread") //
        .meat("Beef") //
        .salad("Iceberg") //
        // .cheese("American Cheese") //
        .sauce("Secret Sauce") //
        .build();

  System.out.println(burger.cheese);
  }

}