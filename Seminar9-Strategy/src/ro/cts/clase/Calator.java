package ro.cts.clase;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume) {  //mod implicit card bancar
        this.nume = nume;
        this.metodaPlata = new CardBancar(10);
    }

    public Calator(String nume, IMetodaPlata metodaPlata) { // metoda de plata e specificata
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) { //calatorul poate modifica metoda de plata
        this.metodaPlata = metodaPlata;
    }

    public void  platesteBilet(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }

}
