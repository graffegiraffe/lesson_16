package main.java.by.rublevskaya.model;

import main.java.by.rublevskaya.model.service.StudentService;
import main.java.by.rublevskaya.model.student.Student;

import java.util.Map;
/*
Create a collection of passport numbers (String format).
Create a collection of students in our group.
Each collection should not have duplicate elements.
Create a key-value collection, where the key will be the passport number from the first collection, and the value will be the Student class object from the second collection.
Loop through the key-value collection with a for-each loop and display the collection elements on the screen.
 */
public class Runner {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Map<String, Student> passportToStudentMap = studentService.generatePassport();
        for (Map.Entry<String, Student> entry : passportToStudentMap.entrySet()) {
            System.out.println("Passport: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}