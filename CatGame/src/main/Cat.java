package main;

public class Cat {
	private int age;
	private String name;
	private String breed;

	public Cat(int age, String name, String breed){
		this.age = age;
		this.name = name;
		this.breed = breed;
	}

	public void meow(){
		System.out.println("meow! .w.");
	}

	@Override
	public String toString(){
		return "This cat's name is " + name
				+ ", its breed is " + breed
				+ ", and its age is " + age + ".";
	}
}
