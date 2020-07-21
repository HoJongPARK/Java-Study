package interfaces;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc a=new CompleteCalc();
		System.out.println(a.add(1, 2));
		System.out.println(a.times(3,4));
		System.out.println(a.square(5));
	}

}
