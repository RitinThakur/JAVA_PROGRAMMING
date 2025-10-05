package Practice;

import java.util.Scanner;

public class Nth_Power_of_a_num {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter the value: ");
	int x=p.nextInt();
	System.out.print("Enter the power value: ");
	int n=p.nextInt();
	int mul=1;
	for(int i=1;i<=n;i++)
	{
		mul=mul*x;
	}
	System.out.println(x+"^"+n+": "+mul);
	}
}
