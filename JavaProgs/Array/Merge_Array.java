package Array;

import java.util.Scanner;

public class Merge_Array {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter Size of 1st Array: ");
	int s1=p.nextInt();
	int [] a1=new int[s1];
	System.out.println();
		
	for(int i=0;i<a1.length;i++)
	{
		System.out.print("Ente Value in 1st array: ");
		a1[i]=p.nextInt();
	}
	System.out.println();
	
	
	System.out.print("Enter Size of 2nd Array: ");
	int s2=p.nextInt();
	int [] a2=new int[s2];
	System.out.println();
	
	for(int i=0;i<a2.length;i++)
	{
		System.out.print("Enter Value in 2nd array: ");
		a2[i]=p.nextInt();
	}
	System.out.println();
	
	
	int []mer=new int[s1+s2];
	for(int i=0;i<a1.length;i++)
	{
		mer[i]=a1[i];
	}
	for(int i=0;i<a2.length;i++)
	{
		mer[a1.length+i]=a2[i];
	}
	System.out.println();
	System.out.println("Elements of Merged Array: ");
	for(int i=0;i<mer.length;i++)
	{
		System.out.println(mer[i]);
	}
	
}
}
