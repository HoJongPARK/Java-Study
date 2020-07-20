package p311;

public class Sonata extends Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("소나타가 시동을 겁니다");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("소나타가 주행중입니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("소나타가 멈춥니다.");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("소나타가 시동을 끕니다.");
	}
	
}
