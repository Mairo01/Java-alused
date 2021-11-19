package Week9.Ex17;

import Week9.Ex17.ui.UserInterface;
import Week9.Ex17.ui.TextUserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
   
