package c.dimensions;

import java.util.Arrays;

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

		// print the cinema
		for (int row = 0; row < cinema.length; row++) {
			System.out.println(Arrays.toString(cinema[row]));
		}
	}

}
