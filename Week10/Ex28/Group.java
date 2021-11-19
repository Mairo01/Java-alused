package Week10.Ex28;

import java.util.ArrayList;
import java.util.List;

public class Group implements MovableInterface {
	private List <MovableInterface> groupList;
	
	public Group() {
        this.groupList = new ArrayList<MovableInterface>();
	}
	
	public void addToGroup(MovableInterface movable) {
		this.groupList.add(movable);
	}
	
	public String toString() {
		String string = "";
		for (MovableInterface specie : this.groupList) {
			string += specie + "\n";
		}
		return string;
	}
	
	public void move(int dx, int dy) {
		for (MovableInterface specie : groupList)
			specie.move(dx, dy);
	}
}
