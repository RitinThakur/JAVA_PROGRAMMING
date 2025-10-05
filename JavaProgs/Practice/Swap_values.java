package Practice;
import java.util.Scanner;

public class Swap_values {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter A container value: ");
	int a=p.nextInt();
	
	System.out.print("Enter B container value: ");
	int b=p.nextInt();
	
	int tmp=a;
	a=b;
	b=tmp;
	System.out.println();
	System.out.println("A:"+a);
	System.out.println("B:"+b);
	
}
}
