package oop.seminars.s05.mvcstudentapp.view;

import oop.seminars.s05.mvcstudentapp.controller.iGetView;
import oop.seminars.s05.mvcstudentapp.model.Student;

import java.util.List;

public class RIP_ViewEng extends View implements iGetView {
    public void printAllStudents(List<Student> group){
        System.out.println("--------List of students: -------- ");
        super.printAllStudents(group);
        System.out.printf("--------Count of students: %d -------- ", group.size());
    }
}
