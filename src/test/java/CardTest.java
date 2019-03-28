import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){

        card = new Card(Suit.SPADES, Rank.EIGHT);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.EIGHT, card.getRank());
    }



}
