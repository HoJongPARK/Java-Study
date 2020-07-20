package study;

public class Student {
	public String Name;
	public int grade;
	public int money;
	public int stuNum;
	public int cardNum;
	public static int serialNum=1000;
	
	public Student(String Name,int grade,int money) {
		this.Name=Name;
		this.grade=grade;
		this.money=money;
		stuNum=serialNum;
		cardNum=serialNum+100;
		serialNum++;
	}
	
	public void takebus(Bus bus) {
		if(money>=1000)
		bus.take(1000);
		money-=1000;
	}
	public void outbus(Bus bus) {
		bus.out();
	}
	public void info() {
		System.out.println(Name+" 성적:"+grade+" 돈:"+money+" 학번:"+stuNum+" 카드번호:"+cardNum);
	}
}
