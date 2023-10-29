package org.example;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Student> students = null;

    public Group(List<Student> students) {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student one){
        students.add(one);
    }
}
