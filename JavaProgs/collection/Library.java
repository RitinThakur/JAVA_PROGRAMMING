package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
	ArrayList<Book2> al=new ArrayList<Book2>();

	public void addBook(Book2 b)
	{
		al.add(b);
	}

	public void removeBook(int id)
	{
		for(int i=0;i<al.size();i++)
		{
			Book2 b2=al.get(i);
			if(b2.id==id)
			{
				al.remove(b2);
			}
		}
	}

	public void removeBook(double price)
	{
		for(int i=0;i<al.size();i++)
		{
			Book2 b2=al.get(i);
			if(b2.price==price)
			{
				al.remove(b2);
			}
		}
	}

	public void removeBook(String name)
	{
		for(int i=0;i<al.size();i++)
		{
			Book2 b2=al.get(i);
			if(b2.name.equals(name))
			{
				al.remove(b2);
			}
		}
	}

	public void sort()
	{
		Collections.sort(al);
	}

	public void display()
	{
		for(Book2 b:al)
		{
			System.out.println(b);
		}
	}
}
