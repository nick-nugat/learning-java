package lectures;

public class Student extends Person {
	private char grade;
	private String id;

	public Student(String name, int age, String id, char grade) {
		super(name, age); //calling superclass constructor
		this.id = id;
		this.grade = grade;
	}

	public void setGrade(char grade) {this.grade = grade; }

	public void setId(String id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public String getId() {
		return id;
	}


	@Override
	public String toString() {
		return getName() + ", " + getAge() + ", " + getId() + ", " + getGrade();
	}
}
