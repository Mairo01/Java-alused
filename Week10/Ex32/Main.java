package Week10.Ex32;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka", 5)));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi aLuwak", 5)));
	}

}
