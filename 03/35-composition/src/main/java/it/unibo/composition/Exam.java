package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private final int id;
    private int maxStudents;
    private int registeredStudents;
    private String courseName;
    private Professor professor;
    private ExamRoom room;
    private Student[] students;

    public Exam(
        final int id,
        final int maxStudents,
        final String courseName,
        final Professor professor,
        final ExamRoom room
    ) {
        int count = 0;
        this.id = id;
        this.maxStudents = maxStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public void registerStudents(Student student) {
        if (this.getRegisteredStudents() + 1 <= this.getMaxStudents()) {
            this.students[this.getRegisteredStudents()] = student;
            this.setRegisteredStudetns(this.getRegisteredStudents() + 1);
        } else {
            System.out.println("Posti esauriti.");
        }
    }

    public int getId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getRegisteredStudents() {
        return this.registeredStudents;
    }

    public void setRegisteredStudetns(int registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public void setRoom(ExamRoom room) {
        this.room = room;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public String toString() {
        return "Exam ID: " + this.getId() + ", Registered Students: " + this.getRegisteredStudents() +
            ", Studenti:\n" + Arrays.toString(students);
    }

}