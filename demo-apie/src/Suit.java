package src;

public enum Suit {
    DIAMOND, CLUB, HEART, SPADE;

    // private int value;

    // private Suit(int value) {
    //   this.value = value;
    // }

    // private int getValue() {
    //   return this.value;
    // }

    // public int compareTo(Suit suit) {
    //     if (this == suit)
    //       return 0;
    //     if (this.getValue() > suit.getValue()) {
    //       return -1;
    //     }
    //     return 1;
    // }

    public static void main(String[] args) {
      System.out.println(Suit.SPADE.compareTo(Suit.CLUB));
    }
}
