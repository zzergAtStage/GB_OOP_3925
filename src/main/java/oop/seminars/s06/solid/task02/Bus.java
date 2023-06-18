package oop.seminars.s06.solid.task02;

public class Bus extends Vehicle{
    private final double speedRestriction = 0.6;
    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * speedRestriction;
    }
}
