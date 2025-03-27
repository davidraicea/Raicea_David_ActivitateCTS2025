package ro.cts.clase;

public class SupaDeLegume extends FelDeMancare{
    private int cantitate;
    public SupaDeLegume(float pret, float calorii,int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString() + "SupaDeLegume{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
