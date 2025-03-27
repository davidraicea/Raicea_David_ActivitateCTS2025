package ro.cts.program;


import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare = rezervareBuilder.setHasAsezareGeam(true)
                .setGenMuzica("Ambientala").build("Andrei");
        System.out.println(rezervare);
        Rezervare rezervare2 = rezervareBuilder.setHasScauneErg(true)
                .build("Maria");
        System.out.println(rezervare2);
      }
}