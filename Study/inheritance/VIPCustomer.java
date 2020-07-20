package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int userID,String name) {
		super(userID,name);
		level="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	@Override
	public int calcPrice(int price) {
		point+=price*bonusRatio;
		System.out.println(name+"ดิ ม๖บา ฑÝพื: "+(price-(int)(price*saleRatio)));
		return price-(int)(price*saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
}
