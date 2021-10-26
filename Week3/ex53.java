package Week3;

import java.util.Scanner;

public class ex53 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Type a word: ");
    String inputString = reader.nextLine();

    System.out.print("Position of word cut: ");
    Integer inputInt = Integer.parseInt(reader.nextLine());

    reader.close();

    System.out.println("Result: " + inputString.substring(0, inputInt));
  }
}
