package c;

public class Test2 {

	public static void main(String[] args) {
		Person p = new Person();
		// p.age = -3500;
		p.setAge(25);
		p.setAge(35);
		p.setAge(-135); // the method will not change the age
		
		// System.out.println(p.age);
		System.out.println(p.getAge());

	}

}
