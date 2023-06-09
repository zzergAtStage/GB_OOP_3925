package oop.seminars.s02;

import oop.seminars.s02.supermarket.classes.*;
import oop.seminars.s02.supermarket.interfaces.iActorBehaviour;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Market market = new Market();
        Diagnostics.startLogger();
        List<iActorBehaviour> clients = new ArrayList<>();
        try{
            clients.add(new OrdinaryClient("Sava"));
            clients.add(new SpecialClient("Josef N.", 12));
            clients.add(new PromoClient("Joke John", 12));
            clients.add(new PromoClient("Joke John", 10));
            clients.add(new PromoClient("Joke John", 7));
        }
        catch(TooManyClientException e) {
            System.out.println("Warning! Promo clients capacity exceeded...");
            }

        for (iActorBehaviour client :
                clients) {
            market.acceptToMarket(client);
        }
        market.acceptToMarket(new TaxService());


        market.update();
    }
}
