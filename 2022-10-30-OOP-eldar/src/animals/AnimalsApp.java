package animals;

public class AnimalsApp {

	public static void main(String[] args) {
		
		AnimalsApp app = new AnimalsApp();
		app.showMenu();

	}
	
	private void showMenu() {
		System.out.println("Animals App Menu ================");
		System.out.println("add animal ................ add");
		System.out.println("show animals .............. show");
		System.out.println("show number of cats ....... cats");
		System.out.println("show number of dogs ....... dogs");
		System.out.println("show number of cows ....... cows");
		System.out.println("exit ...................... x");
		System.out.println("enter choice:");
		
	}

}
