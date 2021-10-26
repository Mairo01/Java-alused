package Week1;

import java.util.Scanner;

public class ex22 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String correctPassword = "carrot";

    System.out.println("Enter password: ");
    String inputPassword = reader.nextLine();
    reader.close();

    if (correctPassword == inputPassword)
      System.out.println("secret");
  }
}
