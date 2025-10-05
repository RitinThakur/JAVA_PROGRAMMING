package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver_Student {
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		ArrayList<Student> sa=new ArrayList<Student>();
		System.out.print("Enter Number of Students: ");
		int n=p.nextInt();

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Student id: ");
			int id=p.nextInt();
			System.out.print("Enter Name: ");
			String nm=p.next();
			System.out.print("Enter Contact number: ");
			long cno=p.nextLong();
			System.out.println();
			sa.add(new Student(id,nm,cno));
		}

		System.out.println("Student data as follows:");
		Iterator<Student> i = sa.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		System.out.println("Student data as follows:");
		for(Student s:sa)
		{
			System.out.println(s);
		}
	}
}
