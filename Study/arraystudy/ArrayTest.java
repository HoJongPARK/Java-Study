package arraystudy;

public class ArrayTest {

	public static void main(String[] args) {
	Book[] arrayTest=new Book[5];
	for(int i=0;i<5;i++) {
		arrayTest[i]=new Book("i","i");
		arrayTest[i].showBookInfo();
	}
	Student[] stuArr=new Student[3];
	stuArr[0]=new Student("박종호");
	stuArr[1]=new Student("호종박");
	
	stuArr[0].showStudentInfo();
	stuArr[1].showStudentInfo();
	}
}
