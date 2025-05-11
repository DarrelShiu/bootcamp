package src;

public class Card {
  //! author use the count of attributes to decide the level of uniqueness
  private char rank; // 1,2,3,4,5,6,7,8,9,10,J,Q,K
  private char suit; // D,C,H,S

  // Constructor
  public Card(char rank, char suit) {
      this.rank = rank;
      this.suit = suit;
  }
  
  // Getter
  public char getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
  }

  // ! Rewrite the definition of the Card
  // ! some of the false -> become true
  public boolean equals(Card card) {
    return this.rank == card.getRank()
        && this.suit == card.getSuit();
  }

  public static void main(String[] args) {
    // ACE Spade
    Card c1 = new Card('A', 'S');
    // Diamond 5 
    Card c2 = new Card('5', 'D');   
    Card c3 = new Card('A', 'S');   

    System.out.println(c1.equals(c3)); // system define 2 different objects

  }
}
