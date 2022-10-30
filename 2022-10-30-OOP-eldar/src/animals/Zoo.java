package animals;

public class Zoo {

	private Animal[] animals = new Animal[10];
	private int index;

	public void addAnimal(Animal animal) {
		if (index < 10) {
			animals[index] = animal;
			index++;
		} else {
			System.out.println("add animal faild - Zoo is full");
		}
	}

	public int getNumberOfCats() {
		int c = 0;
		for (Animal animal : animals) {
			if (animal instanceof Cat) {
				c++;
			}
		}
		return c;
	}

	public int getNumberOfCows() {
		int c = 0;
		for (Animal animal : animals) {
			if (animal instanceof Cow) {
				c++;
			}
		}
		return c;
	}

	public int getNumberOfDogs() {
		int c = 0;
		for (Animal animal : animals) {
			if (animal instanceof Dog) {
				c++;
			}
		}
		return c;
	}

	public void display() {
		System.out.println("All Animals ==============");
		for (Animal animal : animals) {
			if (animal != null) {
				System.out.println(animal);
			}
		}
		System.out.println("==========================");
	}

}
