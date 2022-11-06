package app.core;

import java.util.Scanner;

public class ClaculatorUI {
	
	public static void main(String[] args) {
		ClaculatorUI ui = new ClaculatorUI();
		ui.start();
	}
	
	private Scanner scanner = new Scanner(System.in);
	private Calculator calculator = new Calculator();
	private String userInput;
	
	public void start() {
		while(true) {
			showMenu();
			getUserInput();
			doUserRequest();
		}
	}

	public void doUserRequest() {
		switch(userInput) {
		case "x":
			System.out.println("Bye");
			break;
		case "clr":
			calculator.reset();
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
