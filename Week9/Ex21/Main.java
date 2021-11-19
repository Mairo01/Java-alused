package Week9.Ex21;

public class Main {

	public static void main(String[] args) throws Exception {
	    Printer printer = new Printer("Week9/Ex21/file.txt");

	    printer.printMatchingLines("Väinämöinen");
	    System.out.println("-----");
	    printer.printMatchingLines("Frank Zappa");
	    System.out.println("-----");
	    printer.printMatchingLines("");
	    System.out.println("-----");
	}

}
