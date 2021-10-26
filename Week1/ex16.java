package Week1;

import java.util.Scanner;

public class ex16 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    int inputInt = Integer.parseInt(reader.nextLine());
    reader.close();

    String oddOrEven = inputInt % 2 == 0 ? "even" : "odd";
    String sentence = "The number is" + oddOrEven;

    System.out.println(sentence);
  }
}
