package org.generation.student;
public class Student {
    public String firstName;
    public String lastName;
    public int registration;
    public int grade;
    public int year;

    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }// constructor todos los datos

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }// constructor solo nombres

    public Student(String firstName, String lastName, int registration, int year) {
        this(firstName, lastName);
        this.registration = registration;
        this.year = year;
    }// constructor solo info de registro y año


    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }// Imprime el nombre completo

    public boolean isApproved() {
        return grade >= 60;
    }// Verifica si está aprobado

    public int changeYearIfApproved() {
        if (isApproved()) {
            year += 1;
            System.out.println("Congratulations");
        }// validación if
		return year;
    }// Suma 1 al año e imprime Congratulations
}// class Student
