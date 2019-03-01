package com.javaproject.org;

public class ReportCard {
	private float per;
	private String grade;

	public ReportCard() {

	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public ReportCard(float per ) {
		super();
		this.per = per;
		this.grade = grade;
	}

	public void calGrade() {
		if (per >= 40 && per < 60)
			grade = "2nd Class";
		else if (per >= 60 && per < 75)
			grade = "1st Class";
		else if (per >= 75 && per <= 100)
			grade = "Distinction Honours";

		else
			grade = "Fail";
	}
	
	

	public void printGrade() {
		System.out.println("Grade is: " + grade);
	}
}
