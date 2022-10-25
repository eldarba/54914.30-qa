package c;

public class PersonTest {

	public static void main(String[] args) {
		
		Person dan = new Person();
		Person lea = new Person();
		
		//dan.name = "Dan";
		dan.setName("Dan");
		// lea.name = "Lea";
		lea.setName("Lea");
		
		dan.growUp();
		dan.growUp();
		
		lea.growUp();
		lea.growUp();
		lea.growUp();
		
		System.out.println(dan.getName() + " age: " + dan.getAge());
		System.out.println(lea.getName() + " age: " + lea.getAge());
		
		lea.count(10, 17);

	}

}
