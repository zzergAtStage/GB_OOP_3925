package oop.seminars.s04.studentapp.controllers;

import oop.seminars.s04.studentapp.domain.Student;
import oop.seminars.s04.studentapp.domain.User;
import oop.seminars.s04.studentapp.domain.UserIterator;
import oop.seminars.s04.studentapp.interfaces.iUserService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//is a fabric to create instances
public class StudentService<T extends User> implements iUserService<Student> {
    private List<T> students;
    public StudentService() {
        students = new ArrayList<>();
    }
    /**
     * Returns a students collection
     *
     * @return List of Students
     */
    @Override
    public List<Student> getAll() {
        return (List<Student>) students;
    }


    /**
     * Creates a new user
     * @param firstName Name
     * @param surName Last Name
     * @param age Age
     */
    @Override
    public void create(String firstName, String surName, int age) {
        int id = generateUniqueId();
        Student student = new Student(firstName,surName,age,id);
        students.add((T) student);
    }

    private int generateUniqueId() {
        // Implement a logic to generate a unique id
        return students.size() + 1;
    }
    public Iterator<User> getUserIterator() {
        return new UserIterator<Student>((List<Student>) students);
    }
    public void printToConsole(){
        for (Iterator<User> it = this.getUserIterator(); it.hasNext(); ) {
            System.out.println(it.next().toString());
        }
    }
}
