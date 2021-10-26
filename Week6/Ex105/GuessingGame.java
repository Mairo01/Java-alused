package Week6.Ex105;

import java.util.Scanner;

public class GuessingGame {
  private Scanner reader;
  private int upperLimit;
  private int lowerLimit;

  public GuessingGame() {
    this.reader = new Scanner(System.in);
  }

  public void play(int lowerLimit, int upperLimit) {
    this.upperLimit = upperLimit;
    this.lowerLimit = lowerLimit;
    instructions();
    gameState();
  }

  public void gameState() {
    while (true) {
      int guess = guess();
      boolean isGreater = isGreater(guess); 
      
      if (isGreater) this.lowerLimit = guess;
      if (!isGreater) this.upperLimit = guess;
      
      if (isGameWon(guess)) {
        System.out.println("Picked number is: " + finalNumber(isGreater, guess));
        break;
      }

    }
  }

  public int finalNumber(boolean isGreater, int guess) {
    return isGreater ? guess + 1 : guess - 1;
  }

  public boolean isGameWon(int guess) {
    if (this.upperLimit - this.lowerLimit == 1) return true;
    return false;
  }

  public int guess() {
    return (int) Math.ceil((this.lowerLimit + this.upperLimit) / 2.0);
  }

  public boolean isGreater(int guess) {
    System.out.println("Is your number greater than " + guess + "? (y/n)");
    return reader.nextLine().charAt(0) == 'y' ? true : false;
  }

  public void instructions() {
    int maxQuestions = (int) (Math.log(this.upperLimit - this.lowerLimit) / Math.log(2)) + 1;;

    System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

    System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
    System.out.println("");
    System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
    System.out.println("");
  }
}
