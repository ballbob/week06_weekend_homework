import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class CardTest{
  Card card;

  @Before
  public void before(){
    card = new Card(Suit.DIAMONDS, Face.KING, 10); 
  }

  @Test
  public void canGetSuit(){
    assertEquals(Suit.DIAMONDS, card.getSuit());
  }

  @Test
  public void canGetFace(){
    assertEquals(Face.KING, card.getFace());
  }

  @Test
  public void canGetValue(){
    assertEquals(10, card.getValue());
  }
}