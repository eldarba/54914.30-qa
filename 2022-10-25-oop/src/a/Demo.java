package a;

public class Demo {

	public static void main(String[] args) {
		
		// Box Object
		Box redBox = new Box();
		redBox.length = 10;
		redBox.width = 5;
		redBox.height = 12;
		redBox.color = "Red";
		
		// another Box Object
		Box blackBox = new Box();
		blackBox.length = 1;
		blackBox.width = 1;
		blackBox.height = 1;
		blackBox.color = "Black";
		
		System.out.println(redBox.color);
		System.out.println(redBox.length);
		System.out.println(blackBox.color);
		System.out.println(blackBox.length);
		

	}

}
