package Week5.Ex87;

public class Main {
  public static void main(String[] args) {
    Apartment studioManhattan = new Apartment(1, 16, 5500);
    Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
    Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

    System.out.println(studioManhattan.isLargerApartmentThan(twoRoomsBrooklyn));
    System.out.println(fourAndKitchenBronx.isLargerApartmentThan(twoRoomsBrooklyn));

    System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));
    System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));

    System.out.println(studioManhattan.isMoreExpensiveThan(twoRoomsBrooklyn));
    System.out.println(fourAndKitchenBronx.isMoreExpensiveThan(twoRoomsBrooklyn));
  }
}
