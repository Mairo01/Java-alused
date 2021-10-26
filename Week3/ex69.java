package Week3;

import java.util.Scanner;

public class ex69 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String inputString = reader.nextLine();
    reader.close();

    System.out.println("Is it a palindrome? " + isPalindrome(inputString));
  }

  static String reverseString(String word) {
    String wordReversed = "";

    for (int i = word.length() - 1; i >= 0; i--)
      wordReversed += word.charAt(i);

    return wordReversed;
  }

  static boolean isPalindrome(String word) {
    String wordReversed = reverseString(word);

    if (wordReversed.equals(word)) return true;
    return false;
  }

}
