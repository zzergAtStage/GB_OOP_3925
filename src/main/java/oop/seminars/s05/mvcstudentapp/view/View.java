package oop.seminars.s05.mvcstudentapp.view;

import oop.seminars.s05.mvcstudentapp.model.Student;
import oop.seminars.s05.mvcstudentapp.controller.iGetView;

import java.util.List;
import java.util.Scanner;

public abstract class View implements iGetView {
    public void printAllStudents(List<Student> group){
        for (Student stud :
                group) {
            System.out.println(stud.toString());
        }
    }
    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
