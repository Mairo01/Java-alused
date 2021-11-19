package Week8.Ex10;

public class CivilService {
    private int daysLeft;
    
    public CivilService (){
        this.daysLeft = 362;
    }
    
    public void work() {
        if (this.daysLeft>0) this.daysLeft--;
    }
    
    public int getDaysLeft(){
        return this.daysLeft;
    }
}
