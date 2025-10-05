package Practice;
import java.util.Scanner;

public class Print_Last_Digit {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=p.nextInt();
	System.out.println("last digit of number: "+(n%10));
}
}
