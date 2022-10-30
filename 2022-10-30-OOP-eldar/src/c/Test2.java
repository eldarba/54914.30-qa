package c;

public class Test2 {

	public static void main(String[] args) {
		// create a rectangle
		Rectangle r = new Rectangle();
		r.setLength(7);
		r.setWidth(5);

		// create a Circle
		Circle c = new Circle();
		c.setRadius(3);

		// create an array of Shape objects
		Shape[] arr = new Shape[2];

		// put the shapes in the array
		arr[0] = r;
		arr[1] = c;
		
		// print the area of each shape in the array
		for (int i = 0; i < arr.length; i++) {
			Shape s = arr[i];
			System.out.println("area: " + s.getArea());
		} 

	}

}
