package NPTC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occ {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.print("Enter String: ");
		String inputString = p.nextLine(); // Read the input string from the user
		countCharacters(inputString);       // Call method to count character occurrences
	}

	// Method to count the frequency of each character in a string
	public static void countCharacters(String str) {
		// Create a HashMap to store characters as keys and their counts as values
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		// Convert the string to a char array for easy iteration
		char[] charArray = str.toCharArray();

		// Iterate over each character in the array
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				// If character is already present in the map, increment its count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// If character is not present, initialize its count to 1
				charCountMap.put(c, 1);
			}
		}

		// Print all characters and their counts
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println("'" + entry.getKey() + "': " + entry.getValue());
		}
	}
}
