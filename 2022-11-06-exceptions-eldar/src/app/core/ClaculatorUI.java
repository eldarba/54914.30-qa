package app.core;

import java.util.Scanner;

public class ClaculatorUI {
	
	private Scanner scanner = new Scanner(System.in);
	private String userInput;
	
	
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
		
	}

}
