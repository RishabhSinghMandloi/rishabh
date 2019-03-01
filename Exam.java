package com.javaproject.org;

public class Exam {
	String Name;
	float marks;
	float totalMarks;

	public Exam() {

	}

	public Exam(String examName, float maxMarks, float obtMarks) {
		super();
		this.Name = examName;
		this.marks = maxMarks;
		this.totalMarks = obtMarks;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public float getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}
   
	
	
}
