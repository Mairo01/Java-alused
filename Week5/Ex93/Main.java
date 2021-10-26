package Week5.Ex93;

public class Main {
  public static void main(String[] args) {
    Person pekka = new Person("Pekka", 15, 2, 1993);
    Person steve = new Person("Thomas", 1, 3, 1955);

    System.out.println( steve.getName() + " is " + steve.ageInYears() + " years old");
    System.out.println( pekka.getName() + " is " + pekka.ageInYears() + " years old");

    System.out.println( steve.getName() + " is older than " +  pekka.getName() + ": "+ steve.olderThan(pekka) );
    System.out.println( pekka.getName() + " is older than " +  steve.getName() + ": "+ pekka.olderThan(steve) );
  }
}
