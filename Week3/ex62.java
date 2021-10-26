package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex62 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    
    while (true) {
      String inputString = reader.nextLine();

      if (inputString.isEmpty()) break;

      words.add(inputString);
    }
    reader.close();

    words.remove(words.size() - 1);
    System.out.println("Array: " + words);
  }
}
