package org.example;

import java.util.Objects;

public class Student {
    private int studentID;
    private double gpa;

    public Student(int studentID, double gpa) {
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }
    public double getGpa() {
        return gpa;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return studentID == student.studentID && Double.compare(gpa, student.gpa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, gpa);
    }

    @Override
    public String toString() {
        String str = String.format("Student: { \n" +
                        "studentID: " + studentID + ",\n" +
                        "gpa: " + gpa + "\n}");
        return str;
    }
}
