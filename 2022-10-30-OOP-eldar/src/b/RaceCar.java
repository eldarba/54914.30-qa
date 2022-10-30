package b;

public class RaceCar extends Car {

	private boolean turbo;

	public void setTurboOn() {
		turbo = true;
	}

	public void setTurboOff() {
		turbo = false;
	}
	
	public boolean isTurboOn() {
		return turbo;
	}

}
 