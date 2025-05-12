package ro.cts.main;

import ro.cts.clase.Calator;
import ro.cts.clase.CardCalatorie;
import ro.cts.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Corina", new CardCalatorie(5));
        calator.platesteBilet(5);

        calator.setMetodaPlata(new PlataSMS());
        calator.platesteBilet(5);

        calator.setMetodaPlata(new CardCalatorie(2));
        calator.platesteBilet(5);
    }
}
