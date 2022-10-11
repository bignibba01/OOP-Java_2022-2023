package it.unibo.composition;

public class Professor implements User {
    
    private static final String DOT = ".";
    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses;

    public Professor(
        final int id,
        final String name,
        final String surname,
        final String password,
        final String[] courses
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }
    
    public void replaceCourse(final String course, final int index) {
        this.courses[index] = course;
    }

    public void replaceAllCourses(String[] courses) {
        this.courses = courses;
    }

    public String getUsername() {
        return this.name + DOT + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.toString();
    }
}