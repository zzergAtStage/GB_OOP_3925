package oop.seminars.s06.solid.task05;

//5) Переписать код в соответствии с Dependency Inversion Principle:
public class Car {
    private PetrolEngine engine;
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
//   Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.