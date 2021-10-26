package Week3;

import java.util.Scanner;

public class ex50 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Type a name: ");
    String inputString = reader.nextLine();
    reader.close();

    if (inputString.length() < 3) return;

    for (int i = 0; i < inputString.length(); i++)
      System.out.println(i + 1 + ". character: " + inputString.charAt(i));
  }
}
