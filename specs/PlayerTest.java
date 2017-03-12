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
}