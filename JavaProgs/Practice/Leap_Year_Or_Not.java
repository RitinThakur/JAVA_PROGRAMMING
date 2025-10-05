package Practice;

import java.util.Scanner;

public class Leap_Year_Or_Not {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.print("Enter year: ");
		int yr=p.nextInt();
		if(yr%4==0 && yr%100!=0 || yr%400==0)
		{
			System.out.println(yr+" is a leap year");
		}
		else
			System.out.println(yr+" is not a leap year");
	}
}