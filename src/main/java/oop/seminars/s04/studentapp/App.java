package oop.seminars.s04.studentapp;


import oop.seminars.s04.studentapp.controllers.EmployeeService;
import oop.seminars.s04.studentapp.controllers.StudentService;
import oop.seminars.s04.studentapp.domain.AverageAge;
import oop.seminars.s04.studentapp.domain.Student;
import oop.seminars.s04.studentapp.domain.User;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        StudentService studentDataService = new StudentService();
        EmployeeService employeeService = new EmployeeService();
        AverageAge emplAge = new AverageAge();
        AverageAge studAge = new AverageAge();
        studentDataService.create("Сергей", "Иванов", 22);
        studentDataService.create("Андрей", "Сидоров", 22);


        employeeService.create("Иван", "Петров", 33);
        employeeService.create("Игорь", "Иванов", 23);

        //print employee and students
        studentDataService.printToConsole();
        employeeService.printToConsole();
        //calc average age
        emplAge.countUsers(studentDataService.getAll());
        studAge.countUsers(employeeService.getAll());
        System.out.println("Students average age: " + studAge.getAverageAge());
        System.out.println("Employee average age: " + emplAge.getAverageAge());
    }
}
