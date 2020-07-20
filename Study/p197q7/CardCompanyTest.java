package p197q7;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany hyundae=CardCompany.getInstance();
		Card a=hyundae.createCard();
		Card b=hyundae.createCard();
		
		a.info();
		b.info();

	}

}
