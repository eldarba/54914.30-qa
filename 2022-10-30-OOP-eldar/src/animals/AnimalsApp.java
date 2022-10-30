package animals;

import java.util.Scanner;

public class AnimalsApp {

	public static void main(String[] args) {

		AnimalsApp app = new AnimalsApp();
		Scanner sc = new Scanner(System.in);
		Zoo zoo = new Zoo();

		lbl: while (true) {
			app.showMenu();
			String input = sc.nextLine();
			switch (input) {
			case "show":
				zoo.display();
				break;
			case "cat":
				zoo.addAnimal(new Cat());
				break;
			case "dog":
				zoo.addAnimal(new Dog());
				break;
			case "cow":
				zoo.addAnimal(new Cow());
				break;
			case "cats":
				System.out.println("number of cats: " + zoo.getNumberOfCats());
				break;
			case "dogs":
				System.out.println("number of dogs: " + zoo.getNumberOfDogs());
				break;
			case "cows":
				System.out.println("number of cows: " + zoo.getNumberOfCows());
				break;
			case "x":
				break lbl;
			default:
				System.out.println(input +  " is not a valid operation");
			}
		}
		
		sc.close();
		System.out.println("Bye!");

	}

	private void showMenu() {
		System.out.println();
		System.out.println("Animals App Menu ================");
		System.out.println("add cat ................... cat");
		System.out.println("add dog ................... dog");
		System.out.println("add cow ................... cow");
		System.out.println("show animals .............. show");
		System.out.println("show number of cats ....... cats");
		System.out.println("show number of dogs ....... dogs");
		System.out.println("show number of cows ....... cows");
		System.out.println("exit ...................... x");
		System.out.println("enter choice:");

	}

}
