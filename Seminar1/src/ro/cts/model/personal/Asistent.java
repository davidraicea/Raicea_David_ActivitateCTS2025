package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil {
    private int id;
    private float salariu;

    public Asistent(String nume, int varsta, int id, float salariu) {
        super(nume, varsta);
        this.id = id;
        this.salariu = salariu;
    }

    public int getId() {
        return id;
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder();
        builder.append("Profesorul ").append(this.nume).append(" preda la seminar.");
        System.out.println(builder);
    }

    @Override
    public float calculareVenit() {
        return salariu;
    }
}
