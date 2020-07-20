package arraylist;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a=new Student("Lee");
		Student b=new Student("Kim");
		a.subArr.add(new Subject("국어",70));
		a.subArr.add(new Subject("수학",50));
		b.subArr.add(new Subject("국어",70));
		b.subArr.add(new Subject("수학",85));
		b.subArr.add(new Subject("영어",100));
		
		a.showStudentInfo();
		b.showStudentInfo();
		
	}

}
