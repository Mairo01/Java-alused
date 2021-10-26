package Week1;

import java.util.Scanner;

public class ex9 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Type a number ");
    float inputInt1 = Float.parseFloat(reader.nextLine());

    System.out.print("Type second number ");
    float inputInt2 = Float.parseFloat(reader.nextLine());
    reader.close();

    float result = inputInt1 / inputInt2;
    
    System.out.println(inputInt1 + " / " + inputInt2 + " = " + result);
  }
}
