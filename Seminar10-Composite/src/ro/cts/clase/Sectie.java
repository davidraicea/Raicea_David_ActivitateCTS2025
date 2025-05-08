package ro.cts.clase;

public class Sectie implements Structura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }


    @Override
    public void adaugaStructura(Structura structuri) throws Exception {
        throw new Exception("Functia nu a fost implementata");
    }

    @Override
    public void stergeStructura(Structura structuri) throws Exception {
        throw new Exception("Functia de stergere nu a fost implementata");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Sectia:  "+this.nume);
    }

    @Override
    public Structura getStructura(int index) throws Exception {
        throw new Exception("Functia de cautare nu a fost implementata");
    }
}
