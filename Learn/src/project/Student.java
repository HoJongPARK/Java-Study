package project;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String name;
	private Subject essentialSub;
	private ArrayList<Score> scoreList= new ArrayList<Score>();
	
	public Student(int studentID,String name,Subject essentialSub) {
		this.studentID=studentID;
		this.name=name;
		this.essentialSub=essentialSub;
	}

	public void addScore(Score score) {
		scoreList.add(score);
	}
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getEssentialSub() {
		return essentialSub;
	}

	public void setEssentialSub(Subject essentialSub) {
		this.essentialSub = essentialSub;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
}
