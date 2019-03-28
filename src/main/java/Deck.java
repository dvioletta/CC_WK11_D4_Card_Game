import java.util.ArrayList;

public class Deck {

    ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int getSize(){
        return this.cards.size();
    }


}
