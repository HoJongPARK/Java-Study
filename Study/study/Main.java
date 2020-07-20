package study;

public class Main {

	public static void main(String[] args) {
		
		Person a=new Person("박종호",187,85);
		Student Park=new Student("박종호",95,20000);
		Bus FirstBus=new Bus(706);
		Park.takebus(FirstBus);
		FirstBus.info();
		Park.outbus(FirstBus);
		FirstBus.info();
		Park.info();
		Student Lee=new Student("이동욱",100,30000);
		Lee.info();

	}

}
