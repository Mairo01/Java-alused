package Week11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Dictionary {
	private Map <String, String> dictionary = new HashMap <String, String> ();
	private File file;
	
	public Dictionary(String filename) {
		this.file = new File(filename);
	}
	
	public void saveFileContentToDictionary() throws FileNotFoundException {
		if (!this.file.exists()) throw new FileNotFoundException();
		
	    Scanner reader = new Scanner(file);
		
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			String[] translation = line.split(":");
			
			addTranslation(translation[0], translation[1]);
		}
		reader.close();
	}
	
	public void addTranslation(String word, String translation) {
		if (dictionary.containsKey(word)) return;
		
		this.dictionary.put(word, translation);
		this.dictionary.put(translation, word);
	}
	
	public String translate(String word) {
		return dictionary.containsKey(word) ? dictionary.get(word) : "untranslated";
	}
}
