package Week2;

import java.util.Scanner;

public class ex32 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;

    System.out.print("Until (number)? ");
    int inputInt = Integer.parseInt(reader.nextLine());
    reader.close();

    for (int i = 0; i <= inputInt; i++)
      sum += i;
 
    System.out.println("Sum is " + sum);
  }
}
