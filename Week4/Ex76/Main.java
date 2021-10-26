package Week4.Ex76;

public class Main {
  public static void main(String[] args) {
    Menu menu = new Menu();

    menu.addMeal("potatos");
    menu.addMeal("potatos");
    menu.addMeal("fish");
    menu.addMeal("meat");

    menu.printMenu();

    menu.clearMenu();
    menu.printMenu();
  }
}
