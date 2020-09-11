package project;

import java.util.ArrayList;

public class Subject {
	private String name;
	private int ID;
	private int way;
	private ArrayList<Student> studentArr;
	
	public Subject(String name,int ID) {
		this.name=name;
		this.ID=ID;
		way=Define.AB_TYPE;
		studentArr=new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getWay() {
		return way;
	}

	public void setWay(int way) {
		this.way = way;
	}

	public ArrayList<Student> getStudentArr() {
		return studentArr;
	}

	public void setStudentArr(ArrayList<Student> studentArr) {
		this.studentArr = studentArr;
	}
	
}
