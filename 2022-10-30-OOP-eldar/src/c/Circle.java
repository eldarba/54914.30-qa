package c;

public class Circle extends Shape {

	private double radius;

	public double getArea() {
		// return 3.14 * radius * radius;
		// return Math.PI * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
