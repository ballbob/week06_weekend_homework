import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class DealerTest{
  Player player;
  Dealer dealer;
  Card card1; 
  Card card2; 
  Card card3; 
  Card card4;
  Card card5;
  Card card6;
  Card card7;
  Card card8;
  Card card9;
  Card card10;
  Card card11;
  Card card12;
  Card card13;
  Card card14;
  Card card15;
  Card card16;
  Card card17;
  Card card18;
  Card card19;
  Card card20;
  Card card21;
  Card card22;
  Card card23;
  Card card24;
  Card card25;
  Card card26;
  Card card27;
  Card card28;
  Card card29;
  Card card30;
  Card card31;
  Card card32;
  Card card33;
  Card card34;
  Card card35;
  Card card36;
  Card card37;
  Card card38;
  Card card39;
  Card card40;
  Card card41;
  Card card42;
  Card card43;
  Card card44;
  Card card45;
  Card card46;
  Card card47;
  Card card48;
  Card card49;
  Card card50;
  Card card51;
  Card card52;

  @Before
  public void before(){
    dealer = new Dealer("Jim");
    player = new Player("Jom");
    card1 = new Card(Suit.HEARTS, Face.KING, 10);
    card2 = new Card(Suit.HEARTS, Face.QUEEN, 10);
    card3 = new Card(Suit.HEARTS, Face.JACK, 10);
    card4 = new Card(Suit.HEARTS, Face.TEN, 10);
    card5 = new Card(Suit.HEARTS, Face.NINE, 9);
    card6 = new Card(Suit.HEARTS, Face.EIGHT, 8);
    card7 = new Card(Suit.HEARTS, Face.SEVEN, 7);
    card8 = new Card(Suit.HEARTS, Face.SIX, 6);
    card9 = new Card(Suit.HEARTS, Face.FIVE, 5);
    card10 = new Card(Suit.HEARTS, Face.FOUR, 4);
    card11 = new Card(Suit.HEARTS, Face.THREE, 3);
    card12 = new Card(Suit.HEARTS, Face.TWO, 2);
    card13 = new Card(Suit.HEARTS, Face.ACE, 11);
    card14 = new Card(Suit.DIAMONDS, Face.KING, 10);
    card15 = new Card(Suit.DIAMONDS, Face.QUEEN, 10);
    card16 = new Card(Suit.DIAMONDS, Face.JACK, 10);
    card17 = new Card(Suit.DIAMONDS, Face.TEN, 10);
    card18 = new Card(Suit.DIAMONDS, Face.NINE, 9);
    card19 = new Card(Suit.DIAMONDS, Face.EIGHT, 8);
    card20 = new Card(Suit.DIAMONDS, Face.SEVEN, 7);
    card21 = new Card(Suit.DIAMONDS, Face.SIX, 6);
    card22 = new Card(Suit.DIAMONDS, Face.FIVE, 5);
    card23 = new Card(Suit.DIAMONDS, Face.FOUR, 4);
    card24 = new Card(Suit.DIAMONDS, Face.THREE, 3);
    card25 = new Card(Suit.DIAMONDS, Face.TWO, 2);
    card26 = new Card(Suit.DIAMONDS, Face.ACE, 11);
    card27 = new Card(Suit.CLUBS, Face.KING, 10);
    card28 = new Card(Suit.CLUBS, Face.QUEEN, 10);
    card29 = new Card(Suit.CLUBS, Face.JACK, 10);
    card30 = new Card(Suit.CLUBS, Face.TEN, 10);
    card31 = new Card(Suit.CLUBS, Face.NINE, 9);
    card32 = new Card(Suit.CLUBS, Face.EIGHT, 8);
    card33 = new Card(Suit.CLUBS, Face.SEVEN, 7);
    card34 = new Card(Suit.CLUBS, Face.SIX, 6);
    card35 = new Card(Suit.CLUBS, Face.FIVE, 5);
    card36 = new Card(Suit.CLUBS, Face.FOUR, 4);
    card37 = new Card(Suit.CLUBS, Face.THREE, 3);
    card38 = new Card(Suit.CLUBS, Face.TWO, 2);
    card39 = new Card(Suit.CLUBS, Face.ACE, 11);
    card40 = new Card(Suit.SPADES, Face.KING, 10);
    card41 = new Card(Suit.SPADES, Face.QUEEN, 10);
    card42 = new Card(Suit.SPADES, Face.JACK, 10);
    card43 = new Card(Suit.SPADES, Face.TEN, 10);
    card44 = new Card(Suit.SPADES, Face.NINE, 9);
    card45 = new Card(Suit.SPADES, Face.EIGHT, 8);
    card46 = new Card(Suit.SPADES, Face.SEVEN, 7);
    card47 = new Card(Suit.SPADES, Face.SIX, 6);
    card48 = new Card(Suit.SPADES, Face.FIVE, 5);
    card49 = new Card(Suit.SPADES, Face.FOUR, 4);
    card50 = new Card(Suit.SPADES, Face.THREE, 3);
    card51 = new Card(Suit.SPADES, Face.TWO, 2);
    card52 = new Card(Suit.SPADES, Face.ACE, 11);
  }

  @Test
  public void canGetName(){
    assertEquals("Jim", dealer.getName());
  }

//hand
  @Test
  public void handStartsEmpty(){
    assertEquals(0, dealer.getHandSize());
  }

  @Test
  public void canAddCardtoHand(){
    dealer.addCardtoHand(card50);
    assertEquals(1,dealer.getHandSize());
  }

  @Test
  public void canGetHandValue(){
    dealer.addCardtoHand(card3);
    dealer.addCardtoHand(card6);
    assertEquals(18,dealer.handValue());
  }

  @Test
  public void canPlayCards(){
    dealer.addCardtoHand(card3);
    dealer.addCardtoHand(card6);
    assertEquals("Jim had the JACK of HEARTS (10) and the EIGHT of HEARTS (8)", dealer.playCards());    
  }

//deck
  @Test
  public void deckStartsEmpty(){
    assertEquals(0, dealer.getDeckSize());
  }

}