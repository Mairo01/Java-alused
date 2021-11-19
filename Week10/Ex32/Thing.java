package Week10.Ex32;

public class Thing {
	private String name;
	private int weight;
	
	public Thing(String name, int weight) throws IllegalArgumentException {
		if (weight < 0) throw new IllegalArgumentException("Min weight 0");
        this.name = name;
        this.weight = weight;
	}
	
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
