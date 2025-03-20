package ro.cts.clase;

public abstract class Supa {
    private float pret;
    private int cantitate;
    private float calorii;

    public Supa(float pret, int cantitate, float calorii) {
        this.pret = pret;
        this.cantitate = cantitate;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "pret=" + pret +
                ", cantitate=" + cantitate +
                ", calorii=" + calorii +
                '}';
    }

    public float calculeazaPretPeSutaDeGrame(){
        return pret/cantitate*100;
    }

    public abstract void afiseazaDescriere();

    public float getPret() {
        return pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public float getCalorii() {
        return calorii;
    }
}
