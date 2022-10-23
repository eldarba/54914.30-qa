package demos;

public class Overflow {

	public static void main(String[] args) {
		
		byte x = 125;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++); // overflow
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);

	}

}
