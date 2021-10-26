package Week5.Ex84;

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

  public void decrease(int amount) {
    if (amount <= 0) return;
    this.value = (value - amount) >= 0 ? value - amount : value;
  }

  public void increase(int amount) {
    this.value = value + 1;
  }

  public void reset() {
    this.value = 0;
  }

  public void setInitial() {
    this.value = initialValue;
  }
}
