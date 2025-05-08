package ro.cts.main;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabrica = new FabricaPacienti();
        PacientAbstract pacient = fabrica.getPacient("andrei", "0754412512","andrei@gmail.com");


        Spitalizare spitalizare1 = new Spitalizare(21,1,5);
        Spitalizare spitalizare2 = new Spitalizare(22,2,2);
        Spitalizare spitalizare3 = new Spitalizare(23,3,7);
        Spitalizare spitalizare4 = new Spitalizare(24,4,25);


        pacient.afiseazaPacient(spitalizare1);
        pacient.afiseazaPacient(spitalizare2);

        fabrica.getPacient("Ioana","0727777777","ioana@gmail.ro").afiseazaPacient(spitalizare3);
        try {
            fabrica.getPacient("0727777777").afiseazaPacient(spitalizare4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
