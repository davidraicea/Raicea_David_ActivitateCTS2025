package ro.cts.clase;

public abstract class FelDeMancare {
    private float pret;
    private float calorii;

    public FelDeMancare(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelDeMancare{");
        sb.append("pret=").append(pret);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
