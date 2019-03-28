import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canCheckDeckSize(){
        assertEquals(0, deck.getSize());
    }

    @Test
    public void canBuildDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getSize());

    }

//    @Test
//    public void canShuffleCards(){
//        deck.populateDeck();
//        System.out.println(deck.returnDeck());
//        deck.shuffleDeck();
//        System.out.println(deck.returnDeck());
//    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.shuffleDeck();
        deck.dealCard();
        assertEquals(51, deck.getSize());
    }

}
