package p197q7;

public class CardCompany {
	private static CardCompany Company=new CardCompany();
	private static int serialNum=1000;
	public static CardCompany getInstance() {
		if(Company==null)
			Company=new CardCompany();
		return Company;
	}
	
	public Card createCard() {
		Card instance=new Card(serialNum++);
		return instance;
	}
}
