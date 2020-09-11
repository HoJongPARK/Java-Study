package project;

public class Score {
	private int studentID;
	private Subject subject;
	private int score;
	
	public Score(int studentID,Subject subject,int score) {
		this.studentID=studentID;
		this.subject=subject;
		this.score=score;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public String toString() {
		return "ÇÐ¹ø:"+studentID+","+subject.getName()+":"+score;
	}
}
