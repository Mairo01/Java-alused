package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ex61 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    
    while (true) {
      String inputString = reader.nextLine();

      if (inputString.isEmpty()) break;

      words.add(inputString);
    }
    reader.close();

    System.out.println("Length of array is: " + words.size());
  }
}
