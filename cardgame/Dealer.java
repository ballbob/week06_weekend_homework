package cardgame;

import java.util.*;


// The Dealer class must have a name to identify them, one ArrayList for the deck, and another ArrayList for its present hand, which begins empty.
// It must be able to shuffle the deck, deal one or two cards to the player and display the top card of its hand.

public class Dealer {

  private String name;
  private ArrayList<Card> deck;
  private ArrayList<Card> hand;

  public Dealer(String name){
    this.name = name;
    this.deck = new ArrayList<Card>();
    this.hand = new ArrayList<Card>();
  }

  public String getName(){
    return this.name;
  }

//hand and playing
  public int getHandSize(){
    return this.hand.size();
  }

  public void addCardtoHand(Card card){
    this.hand.add(card);
  }

  public String playCards(){
    String theName = this.name;
    Card theCard1 = this.hand.get(0);
    String theCard1String = theCard1.getAll();
    Card theCard2 = this.hand.get(1);
    String theCard2String = theCard2.getAll(); 
    String playString = theName + " had the " + theCard1String + " and the " + theCard2String;
    return playString;
  }

  public int handValue(){
    Card card1 = this.hand.get(0);
    int card1val = card1.getValue();
    Card card2 = this.hand.get(1);
    int card2val = card2.getValue();
    int value = (card1val + card2val);
    return value;    
  }

//deck
  public int getDeckSize(){
    return this.deck.size();
  }

  public void populateDeck(Card[] cards){
    this.deck.addAll(Arrays.asList(cards));
  }
}