package NPTC;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a String: ");
        String str = p.next();

        // Call the reverseString method to reverse the input string
        String reversed = reverseString(str);

        // Print the original and reversed strings
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse a string using character array
    public static String reverseString(String str) {
        // Convert string to character array to swap characters
        char[] charArray = str.toCharArray();
        int left = 0;                   // Start index
        int right = charArray.length - 1; // End index

        // Loop until the two pointers meet in the middle
        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers towards the middle
            left++;
            right--;
        }

        // Convert character array back to string
        return new String(charArray);
    }
}
