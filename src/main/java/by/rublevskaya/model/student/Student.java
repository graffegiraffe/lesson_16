package main.java.by.rublevskaya.model.student;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + '}';
    }
}
