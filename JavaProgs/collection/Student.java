package collection;

public class Student {
	int sid;
	String sname;
	long cno;
	public Student(int sid, String sname, long cno) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cno = cno;
	}
	@Override
	public String toString() {
		System.out.println("Student id: "+sid);
		System.out.println("Student name: "+sname);
		System.out.println("Student phone number: "+cno);
		return "";
	}
}
