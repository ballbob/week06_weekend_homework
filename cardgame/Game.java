package cardgame;

import java.util.*;

//The Game class organises and runs turns. It must have a Player and Dealer, a turn, and a winner.
//It must have a Turn function, in which the Dealer and Player show their hands, and these are compared. 
//There will, at first, not be a decision-point. That function will be added to Player once turns run. 

public class Game{

  Player player;
  Dealer dealer;
  private int turn;

  public Game(Player player, Dealer dealer){
    this.player = player;
    this.dealer = dealer;
    this.turn = turn;
  }
  
  public String playerPlaysHand(){
    String playerHand = this.player.playCards();
    String dealerHand = this.dealer.playCards();
    int playerValue = 21-this.player.handValue();
    int dealerValue = 21-this.dealer.handValue(); 
    if (playerValue > dealerValue) {
      return "Player wins.";
    } else if (dealerValue > playerValue){
      return "Dealer wins.";
    } else { return "Draw."; }
  }
}