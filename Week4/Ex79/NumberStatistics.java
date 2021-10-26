package Week4.Ex79;

public class NumberStatistics {
  private int amountOfNumbers;
  private int sum;

  public NumberStatistics() {
    amountOfNumbers = 0;
  }

  public void addNumber(int number) {
    this.sum += number;
    this.amountOfNumbers += 1;
  }

  public int amountOfNumbers() {
      return amountOfNumbers;
  }

  public int sum() {
    return sum;
  }

  public double average() {
    return this.sum / this.amountOfNumbers;
  }

}
