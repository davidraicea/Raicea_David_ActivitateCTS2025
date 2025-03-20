package ro.cts.clase;

public class RezervareInterior extends AbstractRezervare{

    private boolean esteLaParter;

    public RezervareInterior(){
        super();
        this.esteLaParter = true;
    }
    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteLaParter = esteLaParter;
    }

    @Override
    public AbstractRezervare copiaza(int ziuaLunii) {
        RezervareInterior rezervare = new RezervareInterior();
        rezervare.esteLaParter = this.esteLaParter;
        rezervare.ziuaLunii = ziuaLunii;
        rezervare.ora = this.ora;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.numeClient = this.numeClient;
        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("esteLaParter=").append(esteLaParter);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
