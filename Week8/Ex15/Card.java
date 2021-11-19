package Week8.Ex15;

public class Card {
    public static final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
    public static final String[] VALUES = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;
    private int value;
    private int suit;
    
    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public String toString() {
        return VALUES[value] + " of " + SUITS[suit];
    }
    
    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }
    
    public int compareTo(Card otherCard) {
    	if (this.value < otherCard.value) return -1;
    	if (this.value == otherCard.value) {
    		if (this.suit < otherCard.suit) return -1;
    		if (this.suit == otherCard.suit) return 0;
    		return 1;
    	}
    	return 1;
    }
}
