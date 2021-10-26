package Week5.Ex88;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> studentsList = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Name: ");
      String name = scanner.nextLine();

      if (name.isEmpty()) break;

      System.out.print("Studentnumber: ");
      String studentnumber = scanner.nextLine();

      studentsList.add(new Student(name, studentnumber));
    }
    scanner.close();

    for (Student student : studentsList)
      System.out.println("Name: " + student.getName() + " , student number: " + student.getStudentNumber());
  }
}
