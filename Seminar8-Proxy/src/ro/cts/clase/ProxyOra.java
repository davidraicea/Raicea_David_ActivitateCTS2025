package ro.cts.clase;

public class ProxyOra implements IRezervare{
    private IRezervare rezervare;

    public ProxyOra(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        if(ora > 18){
            rezervare.rezerva(numeClient,nrPersoane,ora);
        }
        else{
            System.out.println("Nu e nevoie de rezervare, va asteptam.");
        }
    }
}
