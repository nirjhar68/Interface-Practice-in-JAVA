//Notice that this child class implements multiple interfaces
public class Baby extends Human implements SchoolGoing, ForBabies{
	public Baby(String nm, String jb, int ag) {
		super(nm, jb, ag);
	}
	
	@Override
	public void whatGrade() {
		System.out.println("\nI can't go to school");
	}
	
	@Override
	public void eat() {
		System.out.println("I eat only baby food.");
	}
	
	@Override
	public void walk() {
		System.out.println("I can't walk");
	}
}
