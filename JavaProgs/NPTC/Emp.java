package NPTC;

public class Emp {

	int id;               // Default access: accessible within the same package
	private double sal;   // Private access: accessible only within this class

	// Constructor to initialize 'sal' when creating an Emp object
	public Emp(double sal) {
		super();           // Calls the superclass constructor (Object class here)
		this.sal = sal;    // Assign the passed salary to the private field
	}

	// Getter method for 'sal'
	// Provides controlled access to the private variable 'sal'
	public double getSal() {
		return sal;
	}

	// Setter method for 'sal'
	// Allows modifying the private variable 'sal' safely
	public void setSal(double sal) {
		this.sal = sal;
	}

}
