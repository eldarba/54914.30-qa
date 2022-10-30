package c;

public class Test {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.setColor("black");
		r.setLength(5);
		r.setWidth(3);
		System.out.println("area: " + r.getArea());

		Circle c = new Circle();
		c.setColor("pink");
		c.setRadius(3.2);
		System.out.println("area: " + c.getArea());

	}

}
