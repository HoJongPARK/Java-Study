package p197q5;

public class Store {
	String Name;
	int money;
	
	public Store(String Name) {
		this.Name=Name;
		money=0;
	}
	public int buyJuice(String juiceName,int money) {
		if(juiceName=="아메리카노")
		{
			if(money>=4000)
			{
				this.money+=4000;
				return money-4000;
			}
			return money;
		}
		else if(juiceName=="라테") {
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
