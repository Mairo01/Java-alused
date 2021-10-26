package Week4.Ex77;

public class Main {
  public static void main(String[] args) {
    LyyraCard cardTuco = new LyyraCard(2000);
    LyyraCard cardBlondie = new LyyraCard(3000);

    cardTuco.payGourmet();
    cardBlondie.payEconomical();

    System.out.println("Tuco: " + cardTuco);
    System.out.println("Blondie: " + cardBlondie);

    cardTuco.loadMoney(200);
    cardBlondie.payGourmet();

    System.out.println("Tuco: " + cardTuco);
    System.out.println("Blondie: " + cardBlondie);

    cardTuco.payEconomical();
    cardTuco.payEconomical();

    cardBlondie.loadMoney(500);

    System.out.println("Tuco: " + cardTuco);
    System.out.println("Blondie: " + cardBlondie);
  }
}
