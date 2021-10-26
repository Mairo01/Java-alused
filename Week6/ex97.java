package Week6;

public class ex97 {
  public static void main(String[] args) {
    int[] array = {5, 1, 3, 4, 2};
    printElegantly(array);
  }

  public static void printElegantly(int[] array) {
    for (int i = 0; i < array.length; i++) {
      String el = (i == array.length - 1) ? Integer.toString(array[i]) : Integer.toString(array[i]) + ", ";
      System.out.print(el);
    }
    System.out.println("");
  }
}
