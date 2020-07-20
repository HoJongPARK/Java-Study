package arraystudy;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library=new ArrayList<Book>();
		ArrayList<Student> StudentArrayList=new ArrayList<Student>();
		StudentArrayList.add(new Student("����ȣ"));
		StudentArrayList.add(new Student("�չ�ö"));
		StudentArrayList.add(new Student("�����"));
		library.add(new Book("����ȣ","�ȳ��ϼ���"));
		
		for(int i=0;i<library.size();i++) {
			Book book=library.get(i);
			book.showBookInfo();
		}
		for(Book book:library) {
			book.showBookInfo();
		}
		for(Student student:StudentArrayList)
			student.showStudentInfo();
		
	}

}
