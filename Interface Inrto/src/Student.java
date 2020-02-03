
public class Student extends Human implements SchoolGoing{
	//Now we have to add the constructor
	public Student(String nam, String jb, int ag) {
		super(nam, jb, ag);
	}
	
	//A child class can have only one parent class
	//But can implement as many interfaces as it wants
	@Override
	public void whatGrade() {
		System.out.println("I am in 11th grade.");
	}

}
