package Week6;

import java.util.Arrays;

public class ex98 {
  public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] copied = reverseArray(original);

    System.out.println( "original: " + Arrays.toString(original));
    System.out.println( "copied: " + Arrays.toString(copied));
  }

  public static int[] reverseArray(int[] array) {
    int[] arrayReversed = new int[array.length];
    
    for (int i = 0; i < array.length; i++) {
      arrayReversed[array.length - 1 - i] = array[i];
    }

    return arrayReversed;
  }
}
