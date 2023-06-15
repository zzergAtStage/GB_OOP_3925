package oop.seminars.s05.mvcstudentapp.model;

import oop.seminars.s05.mvcstudentapp.controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashModel implements iGetModel {
    private HashMap<Long, Student> students;
    public HashModel(HashMap<Long,Student> students) {
        this.students = new HashMap<>(students);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<Student>(students.values());
    }

    /**
     * Удаляет студента из переданного списка, проверяя его на K в мапе
     * @param students Список студентов из приложения
     * @param number Порядковый номер студента
     * @return Обновленный список студента
     */
    //TODO В данной реализации не используется структура HashMap!
    @Override
    public List<Student> deleteStudentByNumber(List<Student> students, int number) {
       students.remove(findStudentByNumber((long) number));
       return students;
    }

    public Student findStudentByNumber(Long number){
        return this.students.get(number);
    }
}
