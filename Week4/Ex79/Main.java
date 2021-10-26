package Week4.Ex79;

public class Main {
  public static void main(String[] args) {
    NumberStatistics numStats = new NumberStatistics();

    numStats.addNumber(3);
    numStats.addNumber(5);
    numStats.addNumber(1);
    numStats.addNumber(2);
    
    System.out.println("Amount: " + numStats.amountOfNumbers());
    System.out.println("Sum: " + numStats.sum());
    System.out.println("Average: " + numStats.average());
  }
}
