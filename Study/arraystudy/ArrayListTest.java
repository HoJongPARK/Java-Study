package arraystudy;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library=new ArrayList<Book>();
		ArrayList<Student> StudentArrayList=new ArrayList<Student>();
		StudentArrayList.add(new Student("¹ÚÁ¾È£"));
		StudentArrayList.add(new Student("¼Õ¹ÎÃ¶"));
		StudentArrayList.add(new Student("±è½ÃÁø"));
		library.add(new Book("¹ÚÁ¾È£","¾È³çÇÏ¼¼¿ä"));
		
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
