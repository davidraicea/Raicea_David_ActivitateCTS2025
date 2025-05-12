package ro.cts.clase;

public class Calator implements Observer{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume + ", ai primit urmatorul mesaj: " + mesaj);
    }
}
