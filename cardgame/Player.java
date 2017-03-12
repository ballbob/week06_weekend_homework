package cardgame;

import java.util.*;

//The Player class must have a hand (an ArrayList of cards) and a name to identify them.
//This class should be able to play a card or request another card from the deck.
//Because it is a decision, this request function will not be added until the Game class' turn function works with the player automatically playing.

public class Player{

  private String name;
  private ArrayList<Card> hand;

  public Player(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String getName(){
    return this.name;
  }

  public int handLength(){
    return this.hand.size();
  }

  public void addCard(Card card){
    this.hand.add(card);
  }

  public String viewTopCard(){
    Card topcard = this.hand.get(0);
    return topcard.getAll();
  }

  public String viewSecondCard(){
    Card bottomcard = this.hand.get(1);
    return bottomcard.getAll();
  }

  //Standard two-card hand if the player is confident.
  public String playCards(){
    String theName = this.name;
    Card theCard1 = this.hand.get(0);
    String theCard1String = theCard1.getAll();
    Card theCard2 = this.hand.get(1);
    String theCard2String = theCard2.getAll(); 
    String playString = theName + " plays the " + theCard1String + " and the " + theCard2String;
    return playString;
  }

//
  public int handValue(){
    Card card1 = this.hand.get(0);
    int card1val = card1.getValue();
    Card card2 = this.hand.get(1);
    int card2val = card2.getValue();
    int value = (card1val + card2val);
    return value;    
  }

}