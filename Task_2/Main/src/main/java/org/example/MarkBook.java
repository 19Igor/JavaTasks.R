package org.example;

import java.util.ArrayList;
import java.util.List;


/* у каждого студента есть BookMark, в которой находится
* - имя студента
* - его список предметы
* - его список оценок, соотвествующим предметам
* */
public class MarkBook {
    private String studentName = null;
    private List<SubjectWithMarks> diary = null;

    public MarkBook(String studentName) {
        this.studentName = studentName;
        this.diary = new ArrayList<>();
    }

    public List<SubjectWithMarks> getDiary(){
        return diary;
    }



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
