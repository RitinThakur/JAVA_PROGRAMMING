package Practice;
import java.util.Scanner;

public class Odd_Even_Conditional_Stmt {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	
	System.out.println(n%2==0?n+" is Even":n+" is Odd");
	}
}
