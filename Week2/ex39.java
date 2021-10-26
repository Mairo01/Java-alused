package Week2;

import java.util.Scanner;

public class ex39 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter number: ");
    int inputInt = Integer.parseInt(reader.nextLine());
    reader.close();

    printSquare(inputInt);
    printRightTriangle(inputInt);
  }

  static void printSquare(int amount) {
    System.out.println("Square");

    for(int i = 0; i <= amount; i++) {
      System.out.println();
      for (int j = 0; j <= amount; j++)
        System.out.print("* ");
    }
    System.out.println();
  }
  
  static void printRightTriangle(int amount) {
    System.out.println("Half Triangle");

    for (int i = 0; i <= amount; i++) {
      System.out.println();
      for (int j = 0; j <= i; j++)
        System.out.print("* ");
    }
    System.out.println();
  }

}
