package Week4.Ex78;

import java.util.Scanner;

public class Main {
  private static Clock hoursObj = new Clock(23);
  private static Clock minutesObj = new Clock(59);
  private static Clock secondsObj = new Clock(59);
  private static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) throws InterruptedException {
    int inputHours = inputTime("hours");
    int inputMinutes = inputTime("minutes");
    int inputSeconds = inputTime("seconds");

    reader.close();

    setTime(inputHours, inputMinutes, inputSeconds);
    printTime();
  }

  public static void setTime(int hours, int minutes, int seconds) {
    hoursObj.setValue(hours);
    minutesObj.setValue(minutes);
    secondsObj.setValue(seconds);
  }

  public static void printTime() throws InterruptedException {
    while (true) {
      incrementTime(hoursObj, minutesObj, secondsObj);

      String time = hoursObj.toString() + ":" + minutesObj.toString() + ":" + secondsObj.toString();
      System.out.println(time);
      
      Thread.sleep(1000);
    }
  }

  public static void incrementTime(Clock hoursObj, Clock minutesObj, Clock secondsObj) {
    secondsObj.next();

    if (secondsObj.getValue() == 0) {
      minutesObj.next();

      if (minutesObj.getValue() == 0)
        hoursObj.next();
    }
  }

  public static int inputTime(String timeUnit) {
    System.out.print("Time in " + timeUnit + ": ");
    int inputInt = reader.nextInt();
      
    return inputInt;
  }
}
