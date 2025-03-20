package ro.cts.clase;

public class SupaLegume extends Supa{

    public SupaLegume(float pret, int cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString() + " are legume");
    }
}
