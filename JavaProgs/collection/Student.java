package collection;

public class Student {

	// Step 1: Declare properties/attributes of a student
	int sid;        // Student ID
	String sname;   // Student Name
	long cno;       // Contact Number

	// Step 2: Constructor to initialize the student object
	public Student(int sid, String sname, long cno) {
		super();     // Calls Object class constructor (optional)
		this.sid = sid;
		this.sname = sname;
		this.cno = cno;
	}

	// Step 3: Override toString() method to display student details
	@Override
	public String toString() {
		System.out.println("Student id: " + sid);
		System.out.println("Student name: " + sname);
		System.out.println("Student phone number: " + cno);
		return "";
	}
}
