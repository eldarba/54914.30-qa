package animals;

public class Test {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		animals[0] = new Cow();
		animals[1] = new Dog();
		animals[2] = new Cow();
		animals[3] = new Cat();
		animals[4] = new Dog();
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.speak();
		}
	}

}
