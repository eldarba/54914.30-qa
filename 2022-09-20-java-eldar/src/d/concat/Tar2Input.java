package d.concat;

import java.util.Scanner;

public class Tar2Input {

	public static void main(String[] args) {
		
		// to get an input we need a Scanner object - connected to keyboard
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int length = sc.nextInt();
		
		System.out.println("Enter width: ");
		int width = sc.nextInt();
		sc.close(); // closing the scanner when done

		int perimeter = (length + width) * 2;
		int area = length * width;

		System.out.println("Rectangle " + length + " X " + width);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);

	}

}
