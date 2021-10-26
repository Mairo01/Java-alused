package Week6.Ex100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NightSky {
  private ArrayList<String> nightSky = new ArrayList<String>();
  private double density;
  private int width;
  private int height;

  public NightSky(double density, int width, int height) {
    this.density = density;
    this.width = width;
    this.height = height;
    createNightSky();
  }

  public int starsInTheSky() {
    return Collections.frequency(this.nightSky, "*");
  }
  
  public void printTheSky() {
    for (int i = 1; i <= this.height; i++) {
      for (int j = this.width * (i - 1); j < this.width * i; j++)
        System.out.print(nightSky.get(j));
      System.out.println();
    }
  }

  private void createNightSky() {
    Random rand = new Random();

    for (int i = 0; i < this.width * this.height; i++) {
      String character = rand.nextFloat(1) <= this.density ? "*" : " ";
        nightSky.add(character);
      }
  }
}
