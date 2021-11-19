package Week7.Ex7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	    Dictionary dictionary = new Dictionary();
	    dictionary.add("apina", "monkey");
	    dictionary.add("banaani", "banana");
	    dictionary.add("cembalo", "harpsichord");

	    System.out.println(dictionary.translate("apina"));
	    System.out.println(dictionary.translate("porkkana"));
	    
	    UserInterface ui = new UserInterface(reader, dictionary);
	    ui.start();
	}
}
