package study;

public class Bus {
	int busNum;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNum=busNumber;
		passengerCount=0;
		money=0;
	}
	
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	public void info() {
		System.out.println("����"+busNum+"���� �°��� ��"+passengerCount
				+"���̸� ���� ��� ��"+money+"�Դϴ�");
	}
	public void out() {
		if(passengerCount>0)
			passengerCount--;
	}
}
