package Array;

import java.util.Scanner;

public class Print_Char {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter size of arr: ");
	int n=p.nextInt();
	
	char []a= new char[n];
	for(int i=0;i<a.length;i++)
	{
		System.out.print("Enter char: ");
		a[i]=p.next().charAt(0);
	}
	System.out.println();
	System.out.println("Values entered: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
