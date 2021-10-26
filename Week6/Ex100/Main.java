package Week6.Ex100;

public class Main {
  public static void main(String[] args) {
    NightSky NightSky = new NightSky(0.15, 150, 10);
    NightSky.printTheSky();
    System.out.println("Number of stars: " + NightSky.starsInTheSky());
  }
}
