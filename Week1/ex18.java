package Week1;

import java.util.Scanner;

public class ex18 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Type the points: ");
    float inputPoints = Float.parseFloat(reader.nextLine());
    reader.close();

    String grade = "";

    if (inputPoints < 0 || inputPoints > 60) {
      System.out.println("Points can be between 0 and 60");
      return;
    }

    if (inputPoints < 30) { grade = "failed"; }
    else if (inputPoints < 35) { grade = "1"; }
    else if (inputPoints < 40) { grade = "2"; }
    else if (inputPoints < 45) { grade = "3"; }
    else if (inputPoints < 50) { grade = "4"; }
    else if (inputPoints < 61) { grade = "5"; }

    System.out.println("Grade: " + grade);
  }
}
