package Practice;
import java.util.Scanner;

public class Sq_Of_Num {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n=p.nextInt();
	int sq=n*n;
	System.out.println("Square of "+n+" is "+sq);
}
}
