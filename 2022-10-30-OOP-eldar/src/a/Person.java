package a;

public class Person {

	// attributes
	private int id;
	private String name;
	private int age;

	// methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

}
