package oop.seminars.s06.solid.task02;

//2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }

        return 0.0;
    }
}
