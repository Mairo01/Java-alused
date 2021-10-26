package Week4.Ex76;

import java.util.ArrayList;

public class Menu {
  private ArrayList<String> meals;

  public Menu() {
    this.meals = new ArrayList<String>();
  }

  public void addMeal(String meal) {
    if (meals.contains(meal)) return;

    this.meals.add(meal);
  }

  public void printMenu() {
    System.out.println(meals);
  }

  public void clearMenu() {
    this.meals.clear();
  }

}
