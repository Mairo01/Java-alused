package Week1;

import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type the radius: ");
    float radius = Float.parseFloat(reader.nextLine());
    reader.close();

    double circumference = radius * Math.PI * 2;

    System.out.println("Circumference of the circle: " + circumference);
  }
}
