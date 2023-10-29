package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String title = null;
    String description = null;
    int duration;
    List<String> teachers = new ArrayList<>();

    public Course(String title, int duration, String teacher, String description) {
        this.title = title;
        this.duration = duration;
        this.description = description;
        this.teachers.add(teacher);
    }

    public void addTeacher(String teacher){
        this.teachers.add(teacher);
    }

    public void accountForTeacherEvaluations(){
        // Определяем, что студент ходит на данный курс
        //
    }
}
