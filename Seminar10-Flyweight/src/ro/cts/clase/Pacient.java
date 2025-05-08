package ro.cts.clase;

public class Pacient implements PacientAbstract{
    private String nume;
    private String numarTelefon;
    private String adresaEmail;

    public Pacient(String nume, String numarTelefon, String adresaEmail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString());
        System.out.println(spitalizare.toString());

    }

}
