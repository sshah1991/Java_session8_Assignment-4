import java.io.File;
import java.util.Scanner;

public class FileWordVowelCounter {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("read.txt"));

		int nbVowels = 0;
		
		// Find the word base on the spaces
		while (in.hasNext("\\S+")) {
			String word = in.next("\\S+");
			nbVowels += getNbVowels(word); // Increment total Vowel count
		}
		in.close();
		System.out.println("Number of vowels : "+nbVowels);
	}

	//method to find no of vowels in a particular word
	public static int getNbVowels(String word) {
		int result = 0;
		//populate the word in a character array
		char[] chars = word.toCharArray();
		for (Character c : chars) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				result++;
			}
		}
		return result; // return vowel count of the word
	}
}
