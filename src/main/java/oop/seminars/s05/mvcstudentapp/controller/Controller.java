package oop.seminars.s05.mvcstudentapp.controller;

import oop.seminars.s05.mvcstudentapp.model.MenuModel;
import oop.seminars.s05.mvcstudentapp.model.Student;
import oop.seminars.s05.mvcstudentapp.view.RIP_ViewEng;
import oop.seminars.s05.mvcstudentapp.view.RIP_ViewRu;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public boolean testData() {
        return students.size() > 0;
    }

    public void getAllStudents() {
        students = model.getAllStudents();
    }

    /**
     * Выполняет инициализацию приложения и данных моделей
     */
    public void update() {
        //MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("There are no students in this list");
        }
        //view.printAllStudents(model.getAllStudents()); -- goes MVC
    }

    /**
     * Основной исполняющий модуль приложения
     */
    public void run() {

        Commands command = Commands.NONE;
        boolean getNewIteration = true;
        String choice = view.prompt("Choice your language: \n 1 - English \n 2 - Russian \n #>");

        view = (choice.equals("1")) ? new RIP_ViewEng(): new RIP_ViewRu();
        MenuModel menu = new MenuModel();
        menu.showMenu(menu.getMenuByLanguageIdentifier(Integer.parseInt(choice)));
        while (getNewIteration) {

            choice = view.prompt("\nNext step:");
            command = Commands.valueOf(choice.toUpperCase());
            switch (command) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exiting the program");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    int idx = Integer.parseInt(view.prompt("Enter student's number: "));
                    if ((idx)> students.size()) {
                        System.out.println("Wrong choice...");
                        break;
                    }
                    model.deleteStudentByNumber(students,idx);
            }
        }
    }

}
