package Week2;

import java.util.Scanner;

public class ex26 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    float sum = 0;

    System.out.println("To exit the program write 0");

    while (true) {
      System.out.print("Enter a number: ");
      float inputInt = Float.parseFloat(reader.nextLine());

      if (inputInt == 0) break;
      
      sum += inputInt;

      System.out.println("Sum of the numbers is " + sum);
    }

    reader.close();
  }
}
