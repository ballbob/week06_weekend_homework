import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class CardTest{
  Card card;

  @Before
  public void before(){
    card = new Card(Suit.DIAMONDS, Face.KING, 10);
    System.out.println(card);
  }

  @Test
  public void canGetSuit(){
    System.out.println(card);
    assertEquals(Suit.DIAMONDS, card.getSuit());
  }
}