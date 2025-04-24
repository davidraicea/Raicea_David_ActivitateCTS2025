package ro.cts.clase;

public class Rezervare implements IRezervare{

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        System.out.println("Clientul " + numeClient + " are o rezervare de " + nrPersoane + " persoane la ora " + ora);
    }
}
