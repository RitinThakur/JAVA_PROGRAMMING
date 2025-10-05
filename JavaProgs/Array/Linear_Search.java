package Array;

import java.util.Scanner;

public class Linear_Search {
	public static void main(String args[])  
	{  
		Scanner p = new Scanner(System.in);  
		System.out.print("Enter number of elements: ");  
		int n = p.nextInt();   
		int [] arr = new int[n];  
		int c=0;
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter "+i+" Element: ");
			arr[i]=p.nextInt();
		}
		System.out.print("Enter value to find: ");  
		int s = p.nextInt();  
		for (int i = 0; i < n; i++)  
		{  
			if (arr[i] == s)  
			{  
				c++;  
				break;  
			}
		}  
		if (c>=1)  
			System.out.println(s + " is found in array.");
		else 
			System.out.println(s+" is not found in array");
	}  
}
