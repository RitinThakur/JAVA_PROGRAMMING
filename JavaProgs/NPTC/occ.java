package NPTC;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occ {



	    public static void main(String[] args) {
	    	Scanner p=new Scanner(System.in);
	    	System.out.print("Enter String: ");
	        String inputString = p.nextLine();
	        countCharacters(inputString);
	    }

	    public static void countCharacters(String str) {
	        // Create a HashMap to store character counts
	        HashMap<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the string to a char array
	        char[] charArray = str.toCharArray();

	        // Iterate over each character in the array
	        for (char c : charArray) {
	            if (charCountMap.containsKey(c)) {
	                // Increment the count if the character is already in the map
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                // Initialize the count to 1 if the character is not in the map
	                charCountMap.put(c, 1);
	            }
	        }

	        // Print the characters and their counts
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
	        }
	    }
	}


