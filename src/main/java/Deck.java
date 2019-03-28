import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){

        this.cards = new ArrayList<>();
    }

    public int getSize(){

        return this.cards.size();
    }

    private Suit generateSuit(int suitNum){
        switch(suitNum) {
            case 0:
                return Suit.HEARTS;
            case 1:
                return Suit.SPADES;
            case 2:
                return Suit.CLUBS;
            case 3:
                return Suit.DIAMONDS;
        }
        return Suit.HEARTS;
    }

    private Rank generateRank(int rankNum){
        switch(rankNum){
            case 0:
                return Rank.ACE;
            case 1:
                return Rank.TWO;
            case 2:
                return Rank.THREE;
            case 3:
                return Rank.FOUR;
            case 4:
                return Rank.FIVE;
            case 5:
                return Rank.SIX;
            case 6:
                return Rank.SEVEN;
            case 7:
                return Rank.EIGHT;
            case 8:
                return Rank.NINE;
            case 9:
                return Rank.TEN;
            case 10:
                return Rank.JACK;
            case 11:
                return Rank.QUEEN;
            case 12:
                return Rank.KING;
        }
        return Rank.ACE;
    }

    public void populateDeck(){

        Suit suit;
        Rank rank;

        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 13; j++){
                suit = generateSuit(i);
                rank = generateRank(j);
                Card newCard = new Card(suit,rank);
                this.cards.add(newCard);
            }
        }
    }

    public void shuffleDeck(){
        
    }

}
