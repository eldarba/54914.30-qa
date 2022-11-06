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

	/**
	 * @param val the value to divide by
	 * @throws RuntimeException if val is zero
	 */
	public void div(int val) throws RuntimeException {
		if(val != 0) {
			result = result / val;
			return; // the way we end a method when all is good
		}else {
			// end the method with an exception
			// an exception is an object with an error message:
			RuntimeException e = new RuntimeException("divide failed - cannot divide by 0");
			throw e; // // the way we end a method in case of an exceptional event
		}
	}

	public void reset() {
		result = 0;
	}

}
