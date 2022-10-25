package c.dimensions;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {

		int rows = 4;
		int seats = 8;

		char[][] cinema = new char[rows][seats];

		for (int row = 0; row < cinema.length; row++) {
			for (int seat = 0; seat < cinema[row].length; seat++) {
				// System.out.println("row " + row + ", seat " + seat);
				cinema[row][seat] = 'O';
			}
		}
		
		cinema[0][0] = 'X';
		cinema[3][7] = 'X';
		cinema[2][3] = 'X';
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter row: ");
		int userRow = sc.nextInt() - 1;
		System.out.print("enter seat: ");
		int userSeat = sc.nextInt() - 1;
		sc.close();
		
		if(cinema[userRow][userSeat] == 'O') {
			cinema[userRow][userSeat] = 'X';
		}else {
			System.out.println("Sorry, this seat is taken");
		}

		// print the cinema
		for (int row = 0; row < cinema.length; row++) {
			System.out.println(Arrays.toString(cinema[row]));
		}
	}

}
