package src;

import java.util.Objects;

public class Card {
  private char rank; // 1,2,3,4,5,6,7,8,9,10,J,Q,K
  private char suit; // D,C,H,S
  private String[][] cardArr = {{"C", "D", "H", "S"}, {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"}};
  private int positionFrom = 0;
  private int positionTo = 0;

  // Constructor
  public Card(char rank, char suit) {
      this.rank = rank;
      this.suit = suit;
  }

  public char getRank() {
    return this.rank;
  }
  
  public char getSuit() {
    return this.suit;
  }

  // ! Override false -> true
  @Override
  public boolean equals(Object obj) {
    // Part 1: check address first
    if (this == obj)
      return true;
    // Part 2: check if Card object
    if (!(obj instanceof Card))
      return false;
    // Part 3
    Card card = (Card) obj;
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit); // equals and hashcode has the same definition
  }

  @Override
  public String toString() {
    return "Card("
     + "rank=" + this.rank
     + "suit=" + this.suit
     + ")";
  }

  @Override
  // ACE Diamond vs King Diamond -> 1
  // King Diamond vs ACE Diamond -> -1
  public int compareTo(Card card) {
    // rank
    //  Spade -> Heart -> Club -> Dimond
    for (int i = 0; i < cardArr.length; i++) {
      for (int j = 0; j < cardArr[i].length; j++) {
          if (cardArr[i][j] == String.valueOf(this.suit)) {
            positionFrom = (cardArr[i].length - j - 1) * 13 + 1;
            break;
          }
          if (cardArr[i][j] == String.valueOf(this.rank)) {
            positionFrom += 12 - j;
            break;
          }
      }
    }

    for (int i = 0; i < cardArr.length; i++) {
      for (int j = 0; j < cardArr[i].length; j++) {
          if (cardArr[i][j] == String.valueOf(card.getSuit())) {
            positionTo = (cardArr[i].length - j - 1) * 13 + 1;
            break;
          }
          if (cardArr[i][j] == String.valueOf(card.getRank())) {
            positionTo += 12 - j;
            break;
          }
      }
    }
    return positionFrom;
  }



  public static void main(String[] args) {
    String[][] card = {{"C", "D", "H", "S"}, {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"}};

    int position = 0;
    String suit = "D";
    String rank = "K";
    for (int i = 0; i < card.length; i++) {
      for (int j = 0; j < card[i].length; j++) {
          if (card[i][j] == suit) {
            position = (card[i].length - j - 1) * 13 + 1;
            break;
          }
          if (card[i][j] == rank) {
            position += 12 - j;
            break;
          }
      }
    }
    System.out.println(position);
  }
 
}
