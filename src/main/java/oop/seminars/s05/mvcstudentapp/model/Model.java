package oop.seminars.s05.mvcstudentapp.model;

import oop.seminars.s05.mvcstudentapp.controller.iGetModel;

import java.util.List;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }
    public List<Student> getAllStudents(){
        return  students;
    }

    /**
     * Удаление студента по номеру из листа
     * @param number Номер студента (см. лог)
     * @return Обновленный список студентов, после удаления
     */
    @Override
    public List<Student> deleteStudentByNumber(List<Student> students, int number) {
        try{
           Student rem = students.remove(number);
           System.out.println("Deleted: " + rem.toString());
        } catch (NullPointerException e) {
            System.out.printf("There is no student in list #%d",number);
        }
        return students;
    }
}
