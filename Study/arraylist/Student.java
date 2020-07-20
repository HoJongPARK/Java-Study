package arraylist;

import java.util.ArrayList;

public class Student {
	public String name;
	public int studentID;
	public ArrayList<Subject> subArr;
	public static int serialNum=1000;
	
	public Student(String name) {
		this.name=name;
		studentID=serialNum++;
		subArr=new ArrayList<Subject>();
	}
	public void showStudentInfo() {
		System.out.println(studentID+":"+name);
		for(Subject temp:subArr)
			System.out.println(temp.name+":"+temp.score+"Á¡");
	}
}
