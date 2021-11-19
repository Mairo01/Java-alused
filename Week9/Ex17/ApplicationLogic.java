package Week9.Ex17;

import Week9.Ex17.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui){
        this.ui = ui;
    }
    
    public void execute(int loops){
        for (int i=0; i < loops; i++) {
            System.out.println("The application logic works");
            ui.update();  
        }
    }
}
