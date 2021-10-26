package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex58 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();

    while (true) {
      String inputString = reader.nextLine();

      if (words.contains(inputString)) {
        System.out.println("Word " + inputString + " is a duplicate"); 
        break;
      }

      words.add(inputString);
    }
    reader.close();
  }
}
