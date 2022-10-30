package d;

import java.util.Random;

public class SwitchDemo {

	public static void main(String[] args) {

		Random random = new Random();
		int dayVal = random.nextInt(1, 8);
		System.out.println(dayVal);
		String day;

		switch (dayVal) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "ERROR";
		}

		System.out.println(day);

	}

}
