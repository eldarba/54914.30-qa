package c.primitives;

public class Demo4Characters {


	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'א';
		char c3 = 65; // char is a number mapped to a character
		char c4 = 12480; // see unicode table in the internet
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		// convert to int:
		System.out.println((int)c4); // print the unicode value
		
		// usually we need longer text
		// for this we use String
		String text = "this is a String with many characters";
		System.out.println(text);
		
		String msg = "hello 😜🤦‍♀️";
		System.out.println(msg);
		
		
		
	}

}
