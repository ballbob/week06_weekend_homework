import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class PlayerTest{
  Player player;
  Card card1;
  Card card2;

  @Before
  public void before(){
    player = new Player("Remy");
    card1 = new Card(Suit.HEARTS, Face.EIGHT, 8);
    card2 = new Card(Suit.DIAMONDS, Face.FIVE, 5);
  }

  @Test
  public void canGetName(){
    assertEquals("Remy", player.getName());
  }

  @Test
  public void handStartsEmpty(){
    assertEquals(0,player.handLength());
  }

  @Test
  public void canAddCard(){
    player.addCard(card1);
    assertEquals(1,player.handLength());
  }

//  @Test
//  public void canViewTop(){
//    player.addCard(card1);
//    player.addCard(card2);
//    assertEquals("FIVE of DIAMONDS (5)",player.viewTopCard());
//  }
//
//  @Test
//  public void canViewSecond(){
//    player.addCard(card1);
//    player.addCard(card2);
//    assertEquals("EIGHT of HEARTS (8)",player.viewSecondCard());
//  }

//  @Test
//  public void canPlayCards(){
//    player.addCard(card1);
//    player.addCard(card2);
//    assertEquals("Remy plays the FIVE of DIAMONDS (5) and the EIGHT of HEARTS (8)",player.playCards());
//  }

  @Test
  public void canCheckValue(){
    player.addCard(card1);
    player.addCard(card2);
    assertEquals(13,player.handValue());
  }

}