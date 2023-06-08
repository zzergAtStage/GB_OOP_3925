package oop.seminars.s05.mvcstudentapp.veiw;

import oop.seminars.s05.mvcstudentapp.model.Student;
import oop.seminars.s05.mvcstudentapp.controller.iGetVeiw;

import java.util.List;

public class Veiw implements iGetVeiw{
    public void printAllStudents(List<Student> group){
        for (Student stud :
                group) {
            System.out.println(stud.toString());
        }
    }
}
