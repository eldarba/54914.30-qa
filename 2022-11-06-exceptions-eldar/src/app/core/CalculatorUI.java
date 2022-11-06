package app.core;

import java.util.Scanner;

public class CalculatorUI {
	
	public static void main(String[] args) {
		CalculatorUI ui = new CalculatorUI();
		ui.start();
	}
	
	private Scanner scanner = new Scanner(System.in);
	private Calculator calculator = new Calculator();
	private String userInput;
	private boolean quit; // default of boolean is false
	
	public void doUserRequest() {
		int val = 0;
		switch(userInput) {
		case "x":
			quit = true;
			System.out.println("Bye");
			break;
		case "clr":
			calculator.reset();
			break;
		case "=":
			System.out.println("result is: " + calculator.getResult());
			break;
		case "+":
			System.out.println("enter number: ");
			val = scanner.nextInt();
			scanner.nextLine(); // take the new line out of the scanner
			calculator.add(val);
			break;
		case "-":
			System.out.println("enter number: ");
			val = scanner.nextInt();
			scanner.nextLine(); // take the new line out of the scanner
			calculator.sub(val);
			break;
		case "*":
			System.out.println("enter number: ");
			val = scanner.nextInt();
			scanner.nextLine(); // take the new line out of the scanner
			calculator.mul(val);
			break;
		case ":":
			System.out.println("enter number: ");
			val = scanner.nextInt();
			scanner.nextLine(); // take the new line out of the scanner
			calculator.div(val);
			break;
		}
	}
	
	public void start() {
		while(!quit) {
			showMenu();
			getUserInput();
			doUserRequest();
		}
	}

	
	public void showMenu() {
		System.out.println();
		System.out.println("calculator menu ===========");
		System.out.println("add ............ +");
		System.out.println("subtract ....... -");
		System.out.println("multiply ....... *");
		System.out.println("divide ......... :");
		System.out.println("show result .... =");
		System.out.println("reset .......... clr");
		System.out.println("exit ........... x");
	}
	
	public void getUserInput() {
		System.out.println("enter your choice:");
		userInput = scanner.nextLine();
	}
	

}
