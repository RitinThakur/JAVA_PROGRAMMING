package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Nth_Largest_Element {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter Size Of Array: ");
		int s=p.nextInt();

		int []a=new int[s];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value: ");
			a[i]=p.nextInt();
		}

		System.out.println();
		System.out.println("Enter the Largest Element Required from 1 to "+a.length+": ");
		int n=p.nextInt();

		Arrays.sort(a);
		System.out.println(n+" Largest Element :"+a[a.length-n]);
	}
}
