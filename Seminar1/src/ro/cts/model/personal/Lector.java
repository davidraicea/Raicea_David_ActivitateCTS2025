package ro.cts.model.personal;

public class Lector extends Persoana implements IPredabil{

    public Lector(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void preda() {
        System.out.println("Lectorul preda.");
    }

    @Override
    public float calculareVenit() {
        return 0;
    }
}
