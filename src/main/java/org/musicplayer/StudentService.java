package org.musicplayer;

import java.util.List;

public class StudentService {
    private List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public double podielChlapcov() {
        double counter = 0;
        for (Student student : students) {
            if (student.sex() == Sex.MALE) { counter++; }
        }

        return (counter / students.size()) * 100;
    }
}
