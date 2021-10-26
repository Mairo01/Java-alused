package Week2;

import java.util.Scanner;

public class ex41 {
  int red = 55;
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int correctNumber = (int)(Math.random() * 101);
    int inputGuess = 0;

    while (inputGuess != correctNumber) {
      System.out.print("Guess a number: ");
      inputGuess = Integer.parseInt(reader.nextLine());
      printInfo(inputGuess, correctNumber);
    }
    
    reader.close();

    System.out.println("Grats, correct guess!");
  }

  static void printInfo(int inputGuess, int correctNumber) {
    if (correctNumber > inputGuess)
      System.out.println("Correct number is greater");
    if (correctNumber < inputGuess)
      System.out.println("Correct number is lesser");
  }

}
