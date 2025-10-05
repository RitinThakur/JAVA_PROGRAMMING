package Array;

public class Student_Blueprint implements Comparable{
	int id;
	String name;
	int age;

	Student_Blueprint(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public String toString()
	{
		return "ID"+" : "+id+" "+"NAME"+" : "+name+" "+"AGE"+ " : "+age;
	}
	public int compareTo(Object o)
	{
		Student_Blueprint p=(Student_Blueprint) o;
		if(this.id>p.id)
			return 1;
		else if(p.id>this.id)
			return -1;
		else
			return 0;
	}

}
