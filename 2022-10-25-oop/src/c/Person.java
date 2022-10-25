package c;

public class Person {

	private int id;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		if (newName.length() <= 10) {
			name = newName;
		}
	}

	public void setAge(int newAge) {
		if (newAge >= 0 && newAge <= 120) {
			age = newAge;
		}
	}

	public int getAge() {
		return age;
	}

	// method for making this person grow up 1 year
	void growUp() {
		age++;
	}

	void count(int from, int to) {
		System.out.println(name + " counting");
		for (int i = from; i <= to; i++) {
			System.out.println(i);
		}
		System.out.println("===========");
	}

}
