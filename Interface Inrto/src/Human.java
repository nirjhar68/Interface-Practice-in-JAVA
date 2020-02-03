
public class Human {

	String name;
	String job;
	int age;
	//double salary;
	
	public Human(String n, String j, int a) {
		this.name = n;
		this.job = j;
		this.age = a;
		
	}
	
	public void introduction() {
		System.out.println("Hi my name is " + name + "\nI am a " + job + "\nI am " + age + " years old");
	}
}

