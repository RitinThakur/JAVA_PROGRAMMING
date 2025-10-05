package Practice;
import java.util.Scanner;

public class Swap_Num_WO_tmp {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter A container value: ");
		int a=p.nextInt();
		
		System.out.print("Enter B container value: ");
		int b=p.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println();
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		
	}
}
