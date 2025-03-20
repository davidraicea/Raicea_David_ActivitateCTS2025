package ro.cts.clase;

public class SupaCocos extends Supa {

    public SupaCocos(float pret, int cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString() + " are cocos");
    }
}
