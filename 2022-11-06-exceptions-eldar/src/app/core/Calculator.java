package app.core;

public class Calculator {

	private int result;

	public int getResult() {
		return result;
	}

	public void add(int val) {
		result = result + val;
	}

	public void sub(int val) {
		result = result - val;
	}

	public void mul(int val) {
		result = result * val;
	}

	public void div(int val) {
		result = result / val;
	}

	public void reset() {
		result = 0;
	}

}
