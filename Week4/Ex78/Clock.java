package Week4.Ex78;

public class Clock {
  private int value;
  private int upperLimit;
  private int lowerLimit = 0;

  public Clock(int upperLimit) {
    this.upperLimit = upperLimit;
  }

  public void next() {
    this.value = this.value < upperLimit ? this.value += 1 : this.lowerLimit;
  }

  public String toString() {
    if (this.value < 10) return "0" + Integer.toString(this.value);
    return Integer.toString(this.value);
  }

  public int getValue() {
    return this.value;
  }
  public int setValue(int time) {
    return this.value = time;
  }

}
