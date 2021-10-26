package Week1;

import java.util.Scanner;

public class ex19 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.println("How old are you? ");
    float inputAge = Float.parseFloat(reader.nextLine());
    reader.close();

    if (inputAge < 0 || inputAge > 120) {
      System.out.println("Lies!");
      return;
    }

    System.out.println("Roger");
  }
}
