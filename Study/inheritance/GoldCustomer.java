package inheritance;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int userID,String name) {
		super(userID,name);
		level="GOLD";
		bonusRatio=0.02;
		saleRatio=0.1;
	}
	
	public int calcPrice(int price) {
		point+=price*bonusRatio;
		System.out.println(name+"ดิ ม๖บา ฑÝพื: "+(price-(int)(price*saleRatio)));
		return price-(int)(price*saleRatio);
	}
}
