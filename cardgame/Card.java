 package cardgame;

public class Card {

  private Suit suit;
  private Face face;
  private int value;

  public Card(Suit suit, Face face, int value){
    this.suit = suit;
    this.face = face;
    this.value = value;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Face getFace(){
    return this.face;
  }

}