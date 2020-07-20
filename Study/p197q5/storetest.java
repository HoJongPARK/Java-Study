package p197q5;

public class storetest {

	public static void main(String[] args) {
		Person person1=new Person("김씨",30000);
		Person person2=new Person("이씨",40000);

		Store store1=new Store("별다방");
		Store store2=new Store("콩다방");
		
		person1.takeJuice(store1, "아메리카노");
		person2.takeJuice(store2, "라테");
		person2.takeJuice(store2, "섹스");
	}

}
