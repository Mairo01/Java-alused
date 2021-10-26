package Week3;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ex60 {
  public static void main(String[] args) {
    ArrayList<String> words = addInputToArray();
    printSortedArrayList(words);
  }

  public static ArrayList<String> addInputToArray() {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();

    System.out.println("Type many words or exit with empty input");

    while (true) {
      String inputString = reader.nextLine();

      if (inputString.isEmpty()) break;

      words.add(inputString);
    }
    reader.close();

    return words;
  }

  public static void printSortedArrayList(ArrayList<String> array) {
    Collections.sort(array);

    for (String el : array)
      System.out.println(el);
  }

}
