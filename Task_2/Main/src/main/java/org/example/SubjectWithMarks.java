package org.example;

import java.util.ArrayList;
import java.util.List;

public class SubjectWithMarks {
    private String objectTitle;
    private List<Integer> marks = new ArrayList<>();





    public void setObjectTitle(String title){
        this.objectTitle = title;
    }

    public String getObjectTitle(){
        return objectTitle;
    }

    public List<Integer> getMarks() {
        return marks;
    }
    public void addMarks(int mark){
        marks.add(mark);
    }
}
