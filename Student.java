package com.javaproject.org;

public class Student {
	private int id;
	private String name;
	private ReportCard rc;
	Exam exam[];

	public ReportCard getRc() {
		return rc;
	}

	public void setRc(ReportCard rc) {
		this.rc = rc;
	}

	public Student(int id, String name, ReportCard rc) {
		super();
		this.id = id;
		this.name = name;
		this.rc = rc;
	}

	public Student() {

	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("id  = " + id);
		System.out.println("name = " + name);
	      System.out.println("Marks in each subject ");
	      
	      for(int i=0 ;i<exam.length;i++)
	      {
	    	  System.out.println(exam[i].Name + "=" +exam[i].marks + "/" + exam[i].totalMarks);
	    	  
	      }
	}

	public Exam[] getExam() {
		return exam;
	}

	public void setExam(Exam[] e) {
		this.exam = e;
	}
        
}
