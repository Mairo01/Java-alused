package Week8.Ex15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparator<Hand> {
    private ArrayList<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for(Card i : this.hand)
            System.out.println(i);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }

	public int compare(Hand o1, Hand o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
