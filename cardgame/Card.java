 package cardgame;

 // the Card class needs a face, value and suit. It must have methods to show these details. 

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

  public int getValue(){
    return this.value;
  }

  public String getAll(){
    return this.face + " of " + this.suit + " (" + this.value + ")"; 
  }

}