package oop.seminars.s05.mvcstudentapp.controller;

import oop.seminars.s05.mvcstudentapp.model.Student;

import java.util.List;

public interface iGetModel {
    public List<Student> getAllStudents();
    public List<Student> deleteStudentByNumber(List<Student> students, int number);
}
