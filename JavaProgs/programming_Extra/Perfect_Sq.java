package programming_Extra;

import java.util.Scanner;

public class Perfect_Sq {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n=p.nextInt();
for(int i=1;i<=n;i++)
{
		double pr=i*0.5;
		double sq=pr*pr;

		if(sq==i)
			System.out.println(i+" is perfect square");
		else
			System.out.println(i+" is not perfect square");
}
	}
}
