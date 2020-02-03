
public class Original {

	public static void main(String[] args) {
		
		Baby baby1 = new Baby("Sarah", "playful baby", 1);
		baby1.introduction();
		baby1.whatGrade();
		baby1.eat();
		baby1.walk();
		System.out.println("Baby class done. Notice that baby1 instance only shows what was implemented in its class.\n\n");
		
		
		Kindergarten kindg1 = new Kindergarten("Miles", "Student", 3);
		kindg1.introduction();
		kindg1.whatGrade();
		System.out.println("Kindergarten class done. Notice that kindg1 only shows what was implemented in its class.\n\n");
		
		Student stdnt1 = new Student("Amir", "Student", 18);
		stdnt1.introduction();
		stdnt1.whatGrade();
		System.out.println("Notice that stdnt1 instance only shows what was implemented in its class.");
		
		
	}

}
