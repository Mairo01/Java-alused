package Week1;

import java.util.Scanner;

public class ex21 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Type a year: ");
    int inputYear = Integer.parseInt(reader.nextLine());
    reader.close();

    if (inputYear % 100 == 0 && inputYear % 400 == 0 || inputYear % 4 == 0) {
      System.out.println("The year is a leap year");
      return;
    }
    
    System.out.println("The year is not a leap year");
  }
}
