package com.demo.xml;


public class StudentService { //student service depends on student
    //DI //has
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


}
