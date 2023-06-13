package oop.seminars.s04.studentapp.domain;

import java.util.Iterator;
import java.util.function.Consumer;

public class Student extends User implements Comparable<Student> {
    int id;

    public Student(String firstName, String secondName, int age, int id) {
        super(firstName, secondName, age);
        this.id = id;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id set unique number
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return super.firstName.compareTo(o.firstName);
    }
}


