package e;

public class LoopDemo8 {

	public static void main(String[] args) {

		for (int x = 0; x < 10; x++) {
			// =====================================
			for (int i = 0; i < 30; i++) {
				if (x % 2 == 0) {
					System.out.print("*");
				}else {
					System.out.print("-");
				}
			}
			System.out.println();
			// =====================================
		}

	}

}
