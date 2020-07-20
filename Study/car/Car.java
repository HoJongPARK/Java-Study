package car;

public abstract class Car {
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	public abstract void drive();
	public abstract void stop();
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
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
