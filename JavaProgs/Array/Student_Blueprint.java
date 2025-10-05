package Array;

// Student class implementing Comparable to allow sorting by ID
public class Student_Blueprint implements Comparable {

	int id;       // Student ID
	String name;  // Student Name
	int age;      // Student Age

	// Constructor to initialize Student object
	Student_Blueprint(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Override toString() method to print student details
	@Override
	public String toString() {
		return "ID : " + id + " NAME : " + name + " AGE : " + age;
	}

	// Override compareTo method for sorting by ID
	@Override
	public int compareTo(Object o) {
		Student_Blueprint p = (Student_Blueprint) o;
		if (this.id > p.id)
			return 1;    // Current object comes after 'p'
		else if (this.id < p.id)
			return -1;   // Current object comes before 'p'
		else
			return 0;    // IDs are equal
	}
}
