package Practice;

import java.util.Scanner;

public class Swap_Num_Method {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter value of A container: ");
	int a=p.nextInt();
	System.out.print("Enter value of B container: ");
	int b=p.nextInt();
	
	swap(a,b);
}
public static void swap(int a,int b)
{
	int tmp=a;
	a=b;
	b=tmp;
	System.out.println();
	System.out.println("A: "+a);
	System.out.println("B: "+b);
}
}
