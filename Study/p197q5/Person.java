package p197q5;

public class Person {
	String Name;
	int money;
	public Person(String Name,int money) {
		this.Name=Name;
		this.money=money;
	}
	public void takeJuice(Store store,String juiceName) {
		if(this.money==store.buyJuice(juiceName,this.money))
			System.out.println(Name+store.Name+"에서 "+juiceName+"을 사지 못했습니다");
		else
			System.out.println(Name+store.Name+"에서 "+juiceName+"을 맛있게 먹겠습니다");
	}
}
