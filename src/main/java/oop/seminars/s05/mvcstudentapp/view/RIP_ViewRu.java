package oop.seminars.s05.mvcstudentapp.view;

import oop.seminars.s05.mvcstudentapp.controller.iGetView;
import oop.seminars.s05.mvcstudentapp.model.Student;

import java.util.List;

public class RIP_ViewRu extends View implements iGetView {
    @Override
    public void printAllStudents(List<Student> group) {
        System.out.println("------ Список студентов: ----------");
        super.printAllStudents(group);
        System.out.printf("\n------ Итого по списку: %d ----------", group.size());
    }
}
