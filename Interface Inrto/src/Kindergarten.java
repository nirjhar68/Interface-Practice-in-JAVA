
public class Kindergarten extends Student implements SchoolGoing {
	public Kindergarten(String nm, String jb, int ag) {
		super (nm, jb, ag);
	}
 
	//Overriding the whatGrade() method. This method will be visible to Kindergarten class only
	//If we comment it out from this class, Kindergarten class will still have access to the whatGrade() method in Student class
	//Because we have inherited the whatGrade() function from the Student class.
	//But in this class the method will print "I am in 6th grade."
	
	@Override
	public void whatGrade() {
	 System.out.println("I am in Kindergarten.");
	}
}
