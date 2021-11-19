package Week10.Ex28;

public class Organism implements MovableInterface {
	private int x, y;
	
	public Organism(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("x: %d; y: %d", this.x, this.y);
	}
	
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
}
