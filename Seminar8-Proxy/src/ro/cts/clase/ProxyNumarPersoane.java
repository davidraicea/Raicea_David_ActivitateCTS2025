package ro.cts.clase;

public class ProxyNumarPersoane implements IRezervare{

    private IRezervare rezervare;

    public ProxyNumarPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int nrPersoane, int ora) {
        if(nrPersoane > 4){
            this.rezervare.rezerva(numeClient,nrPersoane,ora);
        }
        else{
            System.out.println("Va asteptam in restaurant!");
        }
    }
}
