package Array;

import java.util.Scanner;

public class Remove_Element {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.println("Enter Size of array: ");
	int n=p.nextInt();
	
	int [] a=new int[n];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter value: ");
		a[i]=p.nextInt();
	}
	System.out.println(" Enter index from 0 to "+a.length);
	int ind=p.nextInt();
	int [] res=remove(a,ind);
	for(int i=0;i<a.length-1;i++)
	{
		System.out.println(res[i]+" ");
	}
}

public static int[] remove(int []a, int ind)
{
	if(ind<0 || ind>=a.length)
	{
		System.out.println("index out of bound");
		return a;
	}
	int []res=new int[a.length-1];
	for(int i=0;i<res.length;i++)
	{
		if(i<ind)
		{
			res[i]=a[i];
	
		}
		else
		{
			res[i]=a[i+1];
		}
	}
	return res;
}
}
