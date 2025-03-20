package ro.cts.clase;

public class RezervareExterior extends AbstractRezervare{

    private boolean esteFumator;

    public RezervareExterior() {
        super();
        this.esteFumator = false;
    }

    public RezervareExterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteFumator = esteFumator;
    }

    @Override
    public AbstractRezervare copiaza(int ziuaLunii) {
        RezervareExterior rezervare = new RezervareExterior();
        rezervare.esteFumator = esteFumator;
        rezervare.ziuaLunii = ziuaLunii;
        rezervare.ora = this.ora;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.numeClient = this.numeClient;
        return rezervare;
    }
}
