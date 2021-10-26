package Week5.Ex87;

public class Apartment {
  private int squareMeters;
  private int price;

  public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
    this.squareMeters = squareMeters;
    this.price = pricePerSquareMeter * squareMeters;
  }

  public boolean isLargerApartmentThan(Apartment apartment) {
    if (this.squareMeters <= apartment.squareMeters) return false;
    return true;
  }

  public boolean isMoreExpensiveThan(Apartment apartment) {
    if (this.price < apartment.price) return false;
    return true;
  }

  public double priceDifference(Apartment apartment) {
    double difference = this.price > apartment.price ? this.price - apartment.price : apartment.price - this.price;
    return difference;
  }
}
