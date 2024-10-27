package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student testStudent = new Student("John","Doe",0,0.00);
        System.out.println(testStudent.getDescription());

        ArrayList<Student> testStudents = new ArrayList<Student>();

        testStudents.add(testStudent);
        System.out.println(testStudents.toString());

        StudentManager studentManager = new StudentManager(testStudents);
        System.out.println(studentManager.toString());
    }
}
