package p311;

import java.util.ArrayList;

public class Q5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> carList=new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Avante());
		
		for(Car car:carList) {
			car.run();
		}
	}

}
