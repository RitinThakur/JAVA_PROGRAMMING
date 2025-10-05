package NPTC;

import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=p.next();
        
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Move towards the middle
            left++;
            right--;
        }
        
        return new String(charArray);
    }
}

