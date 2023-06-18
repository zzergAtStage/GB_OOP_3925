package oop.seminars.s06.solid.task01;

/**
 * Class makes a salary calculation
 */
public class SalaryCalc {
    private final double TAX_RATE = 0.25;
    public SalaryCalc() {
    }

    /**
     * Calculates net Salary based on Employee info
     * @param employee
     * @return value of net salary
     */
    public int calculateNetSalary(Employee employee) {
        int baseSalary = employee.getBaseSalary();
        int tax = (int) (baseSalary * TAX_RATE);
        return baseSalary - tax;
    }
}
