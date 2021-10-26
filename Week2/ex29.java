package Week2;

public class ex29 {
  public static void main(String[] args) {
    for (int i = 2; i <= 100; i++)
      printEven(i);
  }

  static void printEven(int num) {
    if (num % 2 == 0) 
      System.out.println(num);
  }

}
