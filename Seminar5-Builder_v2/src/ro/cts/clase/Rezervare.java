package ro.cts.clase;

public class Rezervare {
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScauneErg;
    private boolean hasMasaDecorata;
    private String genMuzica;


    protected Rezervare(String numeClient, boolean hasAsezareGeam,
                        boolean hasMasaDecorata, boolean hasScauneErg, String genMuzica) {
        this.numeClient = numeClient;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasMasaDecorata = hasMasaDecorata;
        this.hasScauneErg = hasScauneErg;
        this.genMuzica = genMuzica;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    protected void setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
    }

    protected void setHasScauneErg(boolean hasScauneErg) {
        this.hasScauneErg = hasScauneErg;
    }

    protected void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    protected void setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasAsezareGeam=").append(hasAsezareGeam);
        sb.append(", hasScauneErg=").append(hasScauneErg);
        sb.append(", hasMasaDecorata=").append(hasMasaDecorata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
