package oop.seminars.s02;

import oop.seminars.s02.supermarket.classes.Market;
import oop.seminars.s02.supermarket.classes.OrdinaryClient;
import oop.seminars.s02.supermarket.classes.PromoClient;
import oop.seminars.s02.supermarket.classes.SpecialClient;
import oop.seminars.s02.supermarket.interfaces.*;

import java.util.Random;
import java.util.random.RandomGenerator;

public class App {
    public static void main(String[] args) {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Sava");
        iActorBehaviour client2 = new SpecialClient("Josef N.", 12);
        iActorBehaviour client3 = new PromoClient("Joke John");
    }
}
