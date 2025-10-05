package collection;

public class User_Library {
	public static void main(String[] args) {
		Library l=new Library();
		l.addBook(new Book2(01,"MANUAL",30));
		l.addBook(new Book2(02,"JAVA",40));
		l.addBook(new Book2(03,"SQL",50));
		l.addBook(new Book2(04,"SELENIUM JAVA",60));
		l.addBook(new Book2(05,"PROJECT",70));
		l.addBook(new Book2(06,"PROGRAMMING",80));
		l.addBook(new Book2(07,"SELENIUM PY",90));
		
		l.display();
		l.removeBook(2);
		l.removeBook("PROGRAMMING");
		l.removeBook(30.0);

		System.out.println();
		l.display();
	}
}
