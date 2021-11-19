package Week7.Ex7;

import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
	public UserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
	}
	
	public void start() {
		while(true) {
			System.out.println("Commands: quit, add");
			String command = this.reader.nextLine();
			
			if (command.equals("quit")) break;
			if (command.equals("add")) addToDictionary();
			if (command.equals("translate")) translate();

		}
	}
	
	private void addToDictionary() {
		System.out.print("Write a word: ");
		String word = this.reader.nextLine();
		System.out.print("Write a translation: ");
		String translation = this.reader.nextLine();
		
		this.dictionary.add(word, translation);
		
		System.out.println("Word and translation added");
	}
	
	private void translate() {
		System.out.print("Enter a word: ");
		String word = this.reader.nextLine();
		System.out.println("Translation: " + this.dictionary.translate(word));
	}
}
