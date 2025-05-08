package ro.cts.clase;

public class Spitalizare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Spitalizare(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("numarSalon=").append(numarSalon);
        sb.append(", numarPat=").append(numarPat);
        sb.append(", numarZileSpitalizare=").append(numarZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
