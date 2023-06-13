package oop.seminars.s04.studentapp.controllers;

import oop.seminars.s04.studentapp.domain.Employee;
import oop.seminars.s04.studentapp.domain.User;
import oop.seminars.s04.studentapp.domain.UserIterator;
import oop.seminars.s04.studentapp.interfaces.iUserService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService<T extends User> implements iUserService<Employee> {
    private List<T> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }
    /**
     * @return
     */
    @Override
    public List<Employee> getAll() {
        return (List<Employee>) employees;
    }

    /**
     * @param firstName
     * @param surName
     * @param age
     */
    @Override
    public void create(String firstName, String surName, int age) {
        Employee employee = new Employee(firstName, surName, age, "Special Status");
        // Add the new employee to the list
        employees.add((T) employee);
    }
    public Iterator<User> getUserIterator() {
        return new UserIterator<Employee>((List<Employee>) employees);
    }
    public void printToConsole(){
        for (Iterator<User> it = this.getUserIterator(); it.hasNext(); ) {
            System.out.println(it.next().toString());
        }
    }
    public void paySalary(Employee obj){
        System.out.printf("Salary to %s is payed yesterday!",obj.getFirstName());
    }
}
