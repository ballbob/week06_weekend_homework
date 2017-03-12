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

}