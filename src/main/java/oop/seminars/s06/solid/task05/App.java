package oop.seminars.s06.solid.task05;

public class App {
    public static void main(String[] args) {
        Engine rotoscop = new ElectricEngine();
        Engine diesel = new DieselEngine();
        Engine gasMotor = new PetrolEngine();
        Car tesla = new Car(rotoscop);
        Car duster = new Car(diesel);
        Car viper = new Car(gasMotor);

        tesla.start();
        duster.start();
        viper.start();
    }
}
