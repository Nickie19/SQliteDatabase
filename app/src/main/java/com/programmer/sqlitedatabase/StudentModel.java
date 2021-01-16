package com.programmer.sqlitedatabase;

public class StudentModel {
    private  int id;
    private String studentname;
    private String course;
    private int regno;
    private boolean isactive;

    //generate constructor
    public StudentModel(int id, String studentname, String course, int regno, boolean isactive) {
        this.id = id;
        this.studentname = studentname;
        this.course = course;
        this.regno = regno;
        this.isactive = isactive;
    }
    //generate to string methods which is necessary when printing the data either on log, notification or ListView
    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", studentname='" + studentname + '\'' +
                ", course='" + course + '\'' +
                ", regno=" + regno +
                ", isactive=" + isactive +
                '}';
    }

    //generate the getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }



}
