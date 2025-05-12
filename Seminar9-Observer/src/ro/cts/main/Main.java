package ro.cts.main;

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.MijlocTransport;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("Calator 1");
        Observer calator2 = new Calator("Calator 2");
        Observer calator3 = new Calator("Calator 3");

        MijlocTransport autobuz = new Autobuz(226);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();

        System.out.println("Dezabonam calator 2.");

        autobuz.stergeObserver(calator2);
        ((Autobuz)autobuz).schimbaTraseul();

    }
}
