package ro.cts.clase;

public class MedicamentSpital {
    private String numeMedicament;
    private float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public void prezintaReteta(){
        System.out.println("Este prezentata reteta pentru medicamentul "+ numeMedicament);
    }

    public void achizitioneazaMedicament(){
        System.out.printf("Medicamentul " + numeMedicament + " a fost achizitionat la pretul de " + pret );
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPret() {
        return pret;
    }
}
