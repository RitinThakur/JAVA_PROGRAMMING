package Practice;
import java.util.Scanner;

public class Even_Odd_Without_Modulus {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.println("Enter a Number: ");
	int n=p.nextInt();
	
	if((n/2)*2==n)
		System.out.println(n+" is Even");
	else
		System.out.println(n+" is Odd");
}
}
