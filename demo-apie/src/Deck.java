package src;

public class Deck {
  private static final Suit[] SUITS = new Suit[] {Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};
  private Card[] cards;

  public Deck() {
    cards = new Card[52];

  }

  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck.getCards());
  }
}
