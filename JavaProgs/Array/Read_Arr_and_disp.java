package Array;

import java.util.Scanner;

public class Read_Arr_and_disp {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter Number Of values you want to enter: ");
	int n=p.nextInt();
	
	int [] a=new int[n];
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print("Enter value: ");
		a[i]=p.nextInt();
	}
	
	System.out.println();
	System.out.println("Values Entered are as bellow");
	
	for(int j=0;j<a.length;j++)
	{
		System.out.println(a[j]);
	}
}
}
