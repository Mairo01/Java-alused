package Week3;

import java.util.Scanner;
import java.util.ArrayList;

public class ex57 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    
    while (true) {
      String inputString = reader.nextLine();

      if (inputString.isEmpty()) break;

      words.add(inputString);
    }
    reader.close();

    for (String word : words)
      System.out.println(word);
  }
}
