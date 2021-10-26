package Week4.Ex75;

public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter(11);

    counter.printValue();

    counter.decrease();
    counter.printValue();

    counter.decrease();
    counter.printValue();

    counter.reset();
    counter.printValue();
    
    counter.setInitial();
    counter.printValue();
  }
}

  