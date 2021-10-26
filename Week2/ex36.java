package Week2;

import java.util.Scanner;

public class ex36 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    double averageOfNumbers = 0;
    int counterNumEven = 0;
    int counterNumOdd = 0;
    int totalNumbers = 0;
    int sum = 0;

    System.out.println("Type numbers: ");

    while (true) {
      float inputNumber = Float.parseFloat(reader.nextLine());

      if (inputNumber == -1) break;
      if (inputNumber % 2 == 0) counterNumEven++;
      if (inputNumber % 2 != 0) counterNumOdd++;

      sum += inputNumber;
    }
    reader.close();

    totalNumbers = counterNumEven + counterNumOdd;
    averageOfNumbers = (double)sum / (double)totalNumbers;
    
    System.out.println
      (
      " The sum is " + sum +
      "\n Numbers entered: " + totalNumbers +
      "\n Average of numbers: " + averageOfNumbers +
      "\n Odd numbers: " + counterNumOdd +
      "\n Even numbers: " + counterNumEven
      );
  }
}
