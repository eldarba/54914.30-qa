package animals;

public class ZooTest {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Cow());
		zoo.addAnimal(new Cat());
		zoo.addAnimal(new Cat());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Dog());
		zoo.display();
		
		System.out.println("Dogs: " + zoo.getNumberOfDogs());
		System.out.println("Cats: " + zoo.getNumberOfCats());
		System.out.println("Cows: " + zoo.getNumberOfCows());

	}

}
