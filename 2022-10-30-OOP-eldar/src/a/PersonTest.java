package a;

public class PersonTest {

	public static void main(String[] args) {

		// create an object from the class
		Employee e = new Employee();
		// set
		e.setId(203);
		e.setName("David");
		e.setAge(35);
		e.setSalary(17_560.75);
		// get
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());
		System.out.println("============");

		// create an object from the class
		Person p = new Person();
		// set the values of attributes
		p.setId(101);
		p.setName("Moshe");
		p.setAge(25);

		// print
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());

	}

}
