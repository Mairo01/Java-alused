package Week3;

import java.util.Scanner;

public class ex56 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String inputString = reader.nextLine();
    reader.close();
    
    String reversedString = reverseString(inputString);

    System.out.println(reversedString);
  }

  static String reverseString(String text) {
    String textReversed = "";

    for (int i = text.length(); i >= 0; i--)
      textReversed += text.charAt(i);
    
    return textReversed;
  }
}
