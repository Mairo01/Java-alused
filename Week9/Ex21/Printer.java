package Week9.Ex21;

import java.io.File;
import java.util.Scanner;

public class Printer {
	private String fileName;
	
	public Printer(String fileName) {
		this.fileName = fileName;
	}
	
	public void printMatchingLines(String word) throws Exception {
		File file = new File(this.fileName);
		Scanner reader = new Scanner(file);
		
		while(reader.hasNextLine()) {
			String line = reader.nextLine();
			
			if (line.contains(word))
				System.out.println(line);
		}
		reader.close();
	}
}
