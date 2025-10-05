package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Student_Dr {
	public static void main(String[] args) {
		
		Scanner p=new Scanner(System.in);
		System.out.print("Enter number of student: ");
		int num=p.nextInt();
		Student_Blueprint [] d=new Student_Blueprint[num];
		System.out.println();
		for(int i=0;i<d.length;i++)
		{
			System.out.println("Enter details of "+(i+1)+" Student");
			System.out.print("Enter Student id: ");
			int id=p.nextInt();
			System.out.print("Enter Student name: ");
			String nm=p.next();
			System.out.print("Enter Student age: ");
			int age=p.nextInt();
			
			d[i]=new Student_Blueprint(id,nm,age);
			System.out.println();
		}
		
		System.out.println("Before Sorting: ");
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		Arrays.sort(d);
		System.out.println();
		
		System.out.println("After Sorting: ");
		System.out.println();
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}
}
