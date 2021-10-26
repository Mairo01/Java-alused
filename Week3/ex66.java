package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex66 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    
    while (true) {
      Integer inputInt = Integer.parseInt(reader.nextLine());

      if (inputInt == -1) break;

      list.add(inputInt);
    }
    reader.close();

    System.out.println("Greatest value in list: " + getGreatestValue(list));
  }

  static int getGreatestValue(ArrayList<Integer> list) {
    return Collections.max(list);
  }
}
