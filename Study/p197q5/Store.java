package p197q5;

public class Store {
	String Name;
	int money;
	
	public Store(String Name) {
		this.Name=Name;
		money=0;
	}
	public int buyJuice(String juiceName,int money) {
		if(juiceName=="�Ƹ޸�ī��")
		{
			if(money>=4000)
			{
				this.money+=4000;
				return money-4000;
			}
			return money;
		}
		else if(juiceName=="����") {
			if(money>=4500) {
				this.money+=4500;
				return money-4500;
			}
			return money;
		}
		else
			return money;
	}
	
}
