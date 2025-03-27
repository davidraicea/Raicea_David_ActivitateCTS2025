package ro.cts.program;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder("Tudor");
        Rezervare rezervare = rezervareBuilder.setHasAsezareGeam(true).setGenMuzica("Jazz").build();
        System.out.println(rezervare);
        Rezervare rezervare1 = rezervareBuilder.setHasMasaDecorata(true).setGenMuzica("Ambientala").build();
        System.out.println(rezervare1);
        System.out.println(rezervare);
    }
}