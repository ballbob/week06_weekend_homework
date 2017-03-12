import java.util.*;

package cardgame;

//The Player class must have a hand (an ArrayList of cards) and a name to identify them.
//This class should be able to play a card or request another card from the deck.
//Because it is a decision, this request function will not be added until the Game class' turn function works with the player automatically playing.

public class Player{

  private String name;
  private ArrayList<Card> hand;

  public Player(){
    this.name = name;
    this.hand = new ArrayList<Card>();
  }
}