package oop.seminars.s06.solid.task02;

public class Car extends Vehicle{
    private final double speedRestriction = 0.8;
    public Car(int maxSpeed) {
        super(maxSpeed);
    }
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * speedRestriction;
    }
}
