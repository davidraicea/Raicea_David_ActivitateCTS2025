package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil {
    private int id;
    private float salariu;
    private float sporVechime;


    public Profesor(String nume, int varsta, int id, float salariu, float sporVechime) {
        super(nume, varsta);
        this.id = id;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }

    public int getId() {
        return id;
    }

    public float getSalariu() {
        return salariu;
    }

    public float getSporVechime() {
        return sporVechime;
    }

    @Override
    public float calculareVenit() {
        return salariu + (sporVechime * salariu);
    }

    @Override
    public void preda() {
        //System.out.println("Profesorul" +getNume()+"preda la curs.");
        StringBuilder builder = new StringBuilder();
        builder.append("Profesorul ").append(this.nume).append(" preda la curs.");
        System.out.println(builder);
    }
}
