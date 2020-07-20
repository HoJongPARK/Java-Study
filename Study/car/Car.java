package car;

public abstract class Car {
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public abstract void drive();
	public abstract void stop();
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	public abstract void wiper();
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
