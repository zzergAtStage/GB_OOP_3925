package oop.seminars.s05.mvcstudentapp.controller;

import oop.seminars.s05.mvcstudentapp.model.Model;
import oop.seminars.s05.mvcstudentapp.veiw.Veiw;

public class Controller {
    private iGetVeiw veiw;
    private iGetModel model;

    public Controller(iGetVeiw veiw, iGetModel model) {
        this.veiw = veiw;
        this.model = model;
    }
    public void update(){
        veiw.printAllStudents(model.getAllStudents());
    }

}
