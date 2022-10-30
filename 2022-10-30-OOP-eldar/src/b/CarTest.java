package b;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setNumber(123456);
		car.setColor("Green");
		car.setSpeed(100);
		
		RaceCar raceCar = new RaceCar();
		raceCar.setNumber(99999);
		raceCar.setColor("Red");
		raceCar.setSpeed(200);
		raceCar.setTurboOn();
		
		System.out.println("The Car ==================");
		System.out.println("number: " + car.getNumber());
		System.out.println("color: " + car.getColor());
		System.out.println("speed: " + car.getSpeed());
		
		System.out.println("The Race Car =============");
		System.out.println("number: " + raceCar.getNumber());
		System.out.println("color: " + raceCar.getColor());
		System.out.println("speed: " + raceCar.getSpeed());
		System.out.println("turbo: " + raceCar.isTurboOn());

	} 

}
