package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student implements Person {
    String name = null;
    String secondName = null;
    int age = 0;
    int studentTicketNumber;
    List<HomeWork> homeWorks = null;
    MarkBook markBook = null;

    public Student(String name, String secondName, int age, int studentTicketNumber) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.studentTicketNumber = studentTicketNumber;
        this.homeWorks = new ArrayList<>();
        this.markBook = new MarkBook(name);
    }

    public void addHomeWork(HomeWork newOne){
        this.homeWorks.add(newOne);
    }

    public void addHomeWorks(List<HomeWork> newOne){
        this.homeWorks = newOne;
    }

    public HomeWork sentHomeWork(HomeWork howeWorkTitle){
        return homeWorks.get(homeWorks.indexOf(howeWorkTitle));
    }

    public void setMark(SubjectWithMarks newOne){
        SubjectWithMarks subject = getMarksByObjectTitle(newOne.getObjectTitle()) ;
        if (subject == null){
            System.out.println("This topic doesn't exist yet.");
            return;
        }

        subject.marks.addAll(newOne.marks);
    }

    private SubjectWithMarks getMarksByObjectTitle(String title){
        for (SubjectWithMarks buff: markBook.getDiary()) {
            if (buff.getObjectTitle().equals(title))
                return buff;
        }
        return null;
    }
























    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public int getStudentTicketNumber() {
        return studentTicketNumber;
    }
    public MarkBook getMarkBook(){
        return markBook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentTicketNumber(int studentTicketNumber) {
        this.studentTicketNumber = studentTicketNumber;
    }
}
