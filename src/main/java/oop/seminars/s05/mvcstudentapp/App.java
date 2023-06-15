package oop.seminars.s05.mvcstudentapp;

import oop.seminars.s05.mvcstudentapp.controller.Controller;
import oop.seminars.s05.mvcstudentapp.model.Model;
import oop.seminars.s05.mvcstudentapp.model.Student;
import oop.seminars.s05.mvcstudentapp.view.View;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        listStud.add(pers1);
        Model model = new Model(listStud);
        View view = new View();

        Controller controller = new Controller(view,model);
        controller.update();

    }
}
