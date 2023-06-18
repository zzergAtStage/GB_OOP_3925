package oop.seminars.s06.solid.task02;

//2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
public class SpeedCalculation {
    /**
     * Calculates allowed speed for vehicle
     * @param vehicle Instance of any available vehicle
     * @return allowed speed
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }

}
