package oop.seminars.s05.mvcstudentapp.model;

import oop.seminars.s05.mvcstudentapp.controller.iGetModel;

import java.util.List;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }
    public List<Student> getAllStudents(){
        return  students;
    }
}
