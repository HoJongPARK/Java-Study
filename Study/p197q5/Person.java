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
			System.out.println(Name+store.Name+"���� "+juiceName+"�� ���� ���߽��ϴ�");
		else
			System.out.println(Name+store.Name+"���� "+juiceName+"�� ���ְ� �԰ڽ��ϴ�");
	}
}
