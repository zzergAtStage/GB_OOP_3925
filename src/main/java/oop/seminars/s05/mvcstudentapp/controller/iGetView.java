package oop.seminars.s05.mvcstudentapp.controller;

import oop.seminars.s05.mvcstudentapp.model.Student;

import java.util.List;

public interface iGetView {
    void printAllStudents(List<Student> students);
    String prompt(String message);
}
