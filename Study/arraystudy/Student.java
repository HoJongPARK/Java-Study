package arraystudy;

public class Student {
	int studentID;
	String name;
	static int serialNum=1000;
	public Student(int id,String name) {
		studentID=id;
		this.name=name;
	}
	public Student(String name) {
		studentID=serialNum++;
		this.name=name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID+name);
	}
}
