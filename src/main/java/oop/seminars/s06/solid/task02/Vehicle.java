package oop.seminars.s06.solid.task02;

public abstract class Vehicle{
    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Declares a method, to calculate allowed speed
     * @return result of calculation
     */
    public abstract double calculateAllowedSpeed();
}
