package Week10.Ex32;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
	private int maxWeight;
	private List <Thing> things = new ArrayList<Thing>();
	
	public MaxWeightBox(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public void add(Thing thing) throws IllegalArgumentException {
		if (thing.getWeight() > this.maxWeight) 
			throw new IllegalArgumentException("Max weight is " + this.maxWeight + " units");
		things.add(thing);
	}

	@Override
	public boolean isInTheBox(Thing inputThing) {
		for (Thing thing : things) 
			if (thing.getName() == inputThing.getName()) return true;
		
		return false;
	}
}
