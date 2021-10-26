package Week2;

import java.util.Scanner;

public class ex30 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Number for the upper limit: ");
    int inputInt = Integer.parseInt(reader.nextLine());
    reader.close();

    for (int i = 1; i <= inputInt; i++)
      System.out.println(i);
  }
}
