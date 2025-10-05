package Practice;
import java.util.Scanner;

class Fact_Of_Num_WO_loops {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = p.nextInt();
		factorial(n,1);
		//int fact = factorial(n);
		//System.out.println("Factorial of " + n + " is: " + fact);
	}

	public static void factorial(int n,int fact) {
		
		if (n == 0)
		{
			System.out.println("Factorial: "+fact);
			return;
		}
		fact=fact*n;
//		System.out.println(fact);
		factorial(n-1,fact);
			
	}


}
