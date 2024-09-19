package org.generation.courses;
import java.util.ArrayList;
import java.util.List;

import org.generation.student.Student;

public class Courses {
	public String courseName;
	public String professorName;
	public int year;
	List <Student> enrolledStudents;
	
	public Courses (String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
		this.enrolledStudents = new ArrayList<>();
	}// constructor todos los datos
	
	public void enroll(Student student){
	      enrolledStudents.add(student);
	}// método enroll

	public void unEnroll(Student student) {
		enrolledStudents.remove(student);
	}// método unEnroll

	public int countStudents(){
	       return enrolledStudents.size();
	}// método countStudents
	   
	public int bestGrade(){
		int bestGrade = 0;
		
		for (Student student : enrolledStudents) {
			if (student.grade > bestGrade) {
				bestGrade = student.grade;
			}
		}
	       return bestGrade;
	 }// método bestGrade
	
	public void enroll(Student[] students) {
	    for (Student student : students) {
	        enroll(student);
	    }
	}// sobrecarga método enroll

}// class Courses
