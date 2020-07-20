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
		System.out.println("버스"+busNum+"번의 승객은 총"+passengerCount
				+"명이며 현재 요금 합"+money+"입니다");
	}
	public void out() {
		if(passengerCount>0)
			passengerCount--;
	}
}
