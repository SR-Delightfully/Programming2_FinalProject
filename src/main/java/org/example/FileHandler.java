package org.example;

import java.util.Objects;

public class FileHandler {
    private StudentManager studentManager;

    public FileHandler(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    public StudentManager getStudentManager() {
        return studentManager;
    }
    public void setStudentManager(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FileHandler that)) return false;
        return Objects.equals(studentManager, that.studentManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentManager);
    }

    @Override
    public String toString() {
        return "FileHandler{" +
                "studentManager=" + studentManager +
                '}';
    }
}
