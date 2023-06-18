package oop.seminars.s06.solid.task01;

import java.util.Date;

/**
 * Describes an employee and gives information about it
 */
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public int getBaseSalary() {
        return baseSalary;
    }

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Returns info about an Employee
     * @return Info
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}
