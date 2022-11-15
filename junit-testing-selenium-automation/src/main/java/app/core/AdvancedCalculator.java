package app.core;

public class AdvancedCalculator {

	private double result;

	public void add(double value) {
		result = result + value;
	}

	public void sub(double value) {
		result = result - value;
	}

	public void mul(double value) {
		result = result * value;
	}

	public void div(double value) {
		result = result / value;
	}

	public void clear() {
		result = 0;
	}

	public double getResult() {
		return result;
	}

}
