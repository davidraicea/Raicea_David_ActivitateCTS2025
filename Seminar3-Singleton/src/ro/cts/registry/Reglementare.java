package ro.cts.registry;


public class Reglementare {
    private String model;
    private int nrReglementare;
    private String dataReglementare;

    protected Reglementare(String model, int nrReglementare, String dataReglementare) {
        this.model = model;
        this.nrReglementare = nrReglementare;
        this.dataReglementare = dataReglementare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reglementare{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrReglementare=").append(nrReglementare);
        sb.append(", dataReglementare='").append(dataReglementare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
