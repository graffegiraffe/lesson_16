package main.java.by.rublevskaya.model.service;

import main.java.by.rublevskaya.model.student.Student;
import main.java.by.rublevskaya.model.util.PassportGenerator;

import java.util.*;

public class StudentService {
    public Map<String, Student> generatePassport() {
        Set<String> passportNumbers = PassportGenerator.generatePassportNumbers();
        List<String> names = Arrays.asList( //тоже загуглила
                "Andryusha", "Katyusha", "Ilyusha", "Olezha", "Seryozha", "Dimochka",
                "Igoryusha", "Marinochka", "Ritochka", "Bogdanchik", "Danik", "Kiryusha",
                "Sultan", "Georgi", "Dmitry", "Vladusha"
        );

        Iterator<String> passportIterator = passportNumbers.iterator();
        Map<String, Student> passportToStudent = new HashMap<>();

        for (String name : names) {
            if (passportIterator.hasNext()) {
                passportToStudent.put(passportIterator.next(), new Student(name));
            }
        }
        return passportToStudent;
    }
}
