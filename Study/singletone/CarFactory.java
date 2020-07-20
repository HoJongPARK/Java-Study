package singletone;

public class CarFactory {
	private static CarFactory Factory=new CarFactory();
	private static int serialNum=10001;
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(Factory==null)
			Factory=new CarFactory();
		return Factory;
	}
	
	public static Car createCar() {
		Car instance=new Car();
		instance.carNum=serialNum++;
		return instance;
	}
}
