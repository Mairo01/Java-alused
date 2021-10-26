package Week4.Ex75;

public class Counter {
  private int value;
  private int initialValue;

  public Counter(int valueAtStart) {
      this.value = valueAtStart;
      this.initialValue = valueAtStart;
  }

  public void printValue() {
      System.out.println("value: " + this.value);
  }

  public void decrease() {
    this.value = (value - 1) >= 0 ? value - 1 : 0;
  }

  public void reset() {
    this.value = 0;
  }

  public void setInitial() {
    this.value = initialValue;
  }
}
