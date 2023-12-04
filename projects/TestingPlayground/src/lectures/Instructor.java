package lectures;

public class Instructor extends Person{
	private int id;
	private int birthYear;
	private String[] courseNum;

	public Instructor(String name, int age, int id){
		super(name, age);
		this.birthYear = birthYear;
		courseNum = new String[]{"201"};
		this.id = id;
	}

}
