package inheritance;

public class Customer {
    protected int userID;
	protected String name;
	protected String level;
	
	public Customer(int userID,String name) {
		this.userID=userID;
		this.name=name;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	int point;
	double bonusRatio;
	
	public Customer() {
		level= "SILVER";
		bonusRatio=0.01;
	}
	
	public int calcPrice(int price) {
		point+=price*bonusRatio;
		System.out.println(name+"님 지불 금액: "+price);
		return price;
	}
	public String showCustomerInfo() {
		return name+" 님의 등급은 "+ level+" 이며, 보너스 포인트는 "+point+" 입니다.";
	}
}
