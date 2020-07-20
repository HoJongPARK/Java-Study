package classlearn;

public class TestClass {

	public static void main(String[] args) {
		/*
		Person person1=new Person();
		person1.setAge(40);
		person1.setName("James");
		person1.setMarried(true);
		person1.setChildNum(3);
		Order order1=new Order("201803120001","abc123","2018년 3월 12일",
				"홍길순","PD0345-12","서울시 영등포구 여의도동 20번지");
		System.out.println(person1.age);
		System.out.println(person1.name);
		System.out.println(person1.married);
		System.out.println(person1.childNum);
		order1.printOrder();
		*/
		MyDate date1=new MyDate(30,2,2000);
		MyDate date2=new MyDate(2,10,2006);
		System.out.print(date1.isValid());
		System.out.print(date2.isValid());
	}

}
