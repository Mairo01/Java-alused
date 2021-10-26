package Week1;

import java.util.Scanner;

public class ex14 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    float inputInt = Float.parseFloat(reader.nextLine());
    reader.close();
    
    String numType = inputInt > 0 ? "positive" : "not positive";

    System.out.println("The number is " + numType);
  }
}
