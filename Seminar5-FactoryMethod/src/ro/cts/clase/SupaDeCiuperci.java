package ro.cts.clase;

public class SupaDeCiuperci extends FelDeMancare {
    private int cantitate;

    public SupaDeCiuperci(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString() + "SupaDeCiuperci{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
