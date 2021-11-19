package Week8.Ex15;

import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card>{
    
    public int compare(Card card1, Card card2){
    	if (card1.getSuit() - card2.getSuit() < 0) {
    		if(card1.getValue() < card2.getValue()) return card1.compareTo(card2);
    		return card2.compareTo(card1);
    	}
    	if (card1.getSuit() == card2.getSuit()) return card1.compareTo(card2);
    	return 1;
    }
}
