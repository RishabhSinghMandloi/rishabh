package com.javaproject.org;

import java.util.Scanner;

public class StudentRunner {
	public static void main(String[] args) {

		int noExam;
		int examTotal = 0;
		int studentTotal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int num = sc.nextInt();
		Student[] st = new Student[num];
		for (int j = 0; j < st.length; j++) {

			Student s = new Student();
			System.out.println("enter student name");
			s.setName(sc.next());
			System.out.println("Enter your id ");
			s.setId(sc.nextInt());

			System.out.println("Enter number of exams");
			noExam = sc.nextInt();

			Exam[] exam = new Exam[noExam];

			for (int i = 0; i < noExam; i++) {

				Exam temp = new Exam();
				System.out.println("Enter exam name ");
				temp.setName(sc.next());
				System.out.println("Enter total marks");
				temp.setTotalMarks(sc.nextInt());
				examTotal += temp.totalMarks;
				System.out.println("Enter obtained marks");
				temp.setMarks(sc.nextInt());
				studentTotal += temp.marks;
				exam[i] = temp;
			}

			s.setExam(exam);
			st[j] = s;
		}
		for (Student student : st) {
			student.print();
		}

		System.out.println("Exam total marks:" + examTotal + "\n Marks Obtained: " + studentTotal);
		float per = (float) studentTotal / examTotal * 100;
		System.out.println("Class Percentage : " + per);
		ReportCard r = new ReportCard(per);
	}
}
