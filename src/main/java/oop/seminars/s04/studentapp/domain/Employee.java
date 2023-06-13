package oop.seminars.s04.studentapp.domain;

import oop.seminars.s03.StudentDomen.Person;

public class Employee extends User {
    private String special;

    public Employee(String firstName, String secondName, int age, String specialStatus) {
        super(firstName, secondName, age);
        this.special = specialStatus;
    }
}
