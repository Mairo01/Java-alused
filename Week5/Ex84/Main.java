package Week5.Ex84;

public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter(11);
    counter.increase(5000);
    counter.printValue();
    counter.decrease(10);
    counter.printValue();
  }
}
