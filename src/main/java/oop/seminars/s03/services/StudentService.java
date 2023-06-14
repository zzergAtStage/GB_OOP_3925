package oop.seminars.s03.services;

import oop.seminars.s03.StudentDomen.Student;

import java.util.List;

public class StudentService implements iPersonService<Student>{
    private int count;
    private List<Student> students;
    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void create(String firstName, String secondName, int age) {

    }
}
