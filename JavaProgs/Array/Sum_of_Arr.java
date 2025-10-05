package Array;

import java.util.Scanner;

public class Sum_of_Arr {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter Size of Array: ");
	int n=p.nextInt();
	
	int [] a=new int[n];
	int sum=0;
	
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print("Enter the value: ");
		a[i]=p.nextInt();
		sum=sum+a[i];
	}
	System.out.println("Sum of Values in array: "+sum);
	
}
}
