package Week11;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Dictionary dictionary = new Dictionary("Week11/words.txt");
		dictionary.saveFileContentToDictionary();

		System.out.println(dictionary.translate("apina"));
		System.out.println(dictionary.translate("ohjelmointi"));
		System.out.println(dictionary.translate("alla oleva"));
	}

}
