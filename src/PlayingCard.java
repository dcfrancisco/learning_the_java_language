/**
 * Created by rhenning on 12/8/13.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class PlayingCard {
    private String rank;
    private String suit;

    public static final String[] VALID_RANKS = {
      "A",  "2",  "3",  "4",
      "5",  "6",  "7",  "8",
      "9",  "10", "Q",  "K"
    };

    public static final String[] VALID_SUITS = {
        "clubs", "diamonds", "hearts", "spades"
    };

    public PlayingCard(String rank, String suit) {
        setRank(rank);
        setSuit(suit);
    }

    private void setRank(String rank) {
        String uppercaseRank = rank.toUpperCase();

        if (Arrays.asList(VALID_RANKS).contains(uppercaseRank)) {
            this.rank = uppercaseRank;
        } else {
            System.out.println("Invalid rank");
        }
    }

    public String getRank() {
        return rank;
    }

    private void setSuit(String suit) {
        String lowercaseSuit = suit.toLowerCase();

        if (Arrays.asList(VALID_SUITS).contains(lowercaseSuit)) {
            this.suit = lowercaseSuit;
        } else {
            System.out.println("Invalid suit");
        }
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return rank + " of " + suit;
    }
}

class PlayingCardTest {
    public static void main(String[] args) {
        PlayingCard queenOfHearts = new PlayingCard("Q", "HeArts");
        assert queenOfHearts.getSuit().equals("hearts") : "Expected 'hearts' got "
                + queenOfHearts.getSuit();

        PlayingCard aceOfDiamonds = new PlayingCard("a", "diamonds");
        assert aceOfDiamonds.getSuit().equals("diamonds") : "Expected 'diamonds' got "
                + aceOfDiamonds.getSuit();

        PlayingCard threeOfClubs = new PlayingCard("3", "CLUBS");
        assert threeOfClubs.getRank().equals("3") : "Expected '3' got "
                + threeOfClubs.getRank();

        PlayingCard sevenOfSpades = new PlayingCard("7", "sPaDEs");
        assert sevenOfSpades.getRank().equals("7") : "Expected '7' got "
                + sevenOfSpades.getRank();

        PlayingCard invalidRankCard = new PlayingCard("X", "clubs");
        assert invalidRankCard.getRank() == null : "Expected null got "
                + invalidRankCard.getRank();

        PlayingCard invalidSuitCard = new PlayingCard("4", "p00ps");
        assert invalidSuitCard.getSuit() == null : "Expected null got "
                + invalidSuitCard.getSuit();
    }
}

