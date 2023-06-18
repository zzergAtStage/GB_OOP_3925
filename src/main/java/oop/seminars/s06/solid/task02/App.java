package oop.seminars.s06.solid.task02;

public class App {
    public static void main(String[] args) {
       int maxSpeed = 80;
        Vehicle car = new Car(maxSpeed);
        Vehicle bus = new Bus(maxSpeed);
        SpeedCalculation sc = new SpeedCalculation();

        System.out.printf("Allowed Speed for %s: %f, %n", car.getClass().getSimpleName()
                ,sc.calculateAllowedSpeed(car));
        System.out.printf("Allowed Speed for %s: %f %n", bus.getClass().getSimpleName()
                ,sc.calculateAllowedSpeed(bus));
    }
}
