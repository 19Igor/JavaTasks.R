package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Person{
    String name = null;
    String secondName = null;
    int age = 0;
    List<String> subject = null;
    List<Group> groups = null;
    List<SubjectWithMarks> subjectWithMarks = null;

    public Teacher(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.subject = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.subjectWithMarks = new ArrayList<>();
    }

    public void addGroup(Group group){
        this.groups.add(group);
    }

    public void deleteGroup(Group group){
        this.groups.remove(group);
    }

    public void sendHomeWork(List<HomeWork> allHomeWorks){
        for (Group group: groups) {
            for (Student student: group.students) {
                    student.addHomeWorks(allHomeWorks);
            }
        }
    }

    public void putMarksToStudents(List<MarkBook> vedomost, String subjectName){
        // предполагается, что необходимые предметы и студенты уже находятся в соотвествующих списках
        for (Group teacherGroup: groups) {
            for (Student student : teacherGroup.students) {

                SubjectWithMarks marks = getStudentMarksFromVedomost(student.name, vedomost, subjectName);
                SubjectWithMarks fromStudent = getCurrentStudentMarks(student, subjectName);
                assert marks != null;
                assert fromStudent != null;


                for (int mark: marks.getMarks()) {
                    fromStudent.addMarks(mark);
                }
            }
        }
    }

    private SubjectWithMarks getStudentMarksFromVedomost(String studentName, List<MarkBook> vedomost, String subjectName){
        for (MarkBook markBook: vedomost) {
            if (markBook.getStudentName().equals(studentName)){
                // нужно получить
                for (SubjectWithMarks anotherOne: markBook.getDiary()) {
                    if (anotherOne.getObjectTitle().equals(subjectName)){
                        return anotherOne;
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private SubjectWithMarks getCurrentStudentMarks(Student student, String subjectName){
        for (SubjectWithMarks object: student.getMarkBook().getDiary()){
            if (object.getObjectTitle().equals(subjectName)){
                return object;
            }
            return null;
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

    public List<String> getSubject() {
        return subject;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<SubjectWithMarks> getStudentMarks() {
        return subjectWithMarks;
    }

    // ------------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
