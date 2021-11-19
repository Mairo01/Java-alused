package Week7.Ex7;

import java.util.ArrayList;
import java.util.HashMap;

class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
    	this.dictionary = new HashMap<String, String>();
    }
    
	public String translate(String word) {
		return this.dictionary.containsKey(word) ? this.dictionary.get(word) : null;
	}
	
	public void add(String word, String translation) {
		this.dictionary.put(word, translation);
	}
	
	public int amountOfWords() {
		return this.dictionary.size();
	}
	
	public ArrayList<String> translationList() {
		ArrayList<String> translations = new ArrayList<String>();
		
		for (String key : dictionary.keySet())
			translations.add(key);
		
		return translations;
	}
}
