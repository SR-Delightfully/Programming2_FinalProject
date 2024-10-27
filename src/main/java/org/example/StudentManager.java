package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentManager that)) return false;
        return Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + students +
                '}';
    }
}
