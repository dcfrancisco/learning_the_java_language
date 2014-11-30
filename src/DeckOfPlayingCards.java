/**
 * Created by rhenning on 12/8/13.
 */
public class DeckOfPlayingCards {
    private PlayingCard[] cards;

    public DeckOfPlayingCards() {
        cards = new PlayingCard[52];

        int i = 0;

        for (String suit : PlayingCard.VALID_SUITS) {
            for (String rank : PlayingCard.VALID_RANKS) {
                cards[i] = new PlayingCard(rank, suit);
                ++i;
            }
        }
    }

    public PlayingCard[] getCards() {
        return cards;
    }
}

class DeckOfPlayingCardsTest {
    public static void main(String[] args) {
        DeckOfPlayingCards deck = new DeckOfPlayingCards();
        assert deck.getCards().length == 52 : "Expected 52 got "
                + deck.getCards().length;

        for (PlayingCard card : deck.getCards()) {
            System.out.println(card.getValue());
        }
    }
}