package ro.cts.clase;

public interface Structura {
    void adaugaStructura(Structura structuri) throws Exception;
    void stergeStructura(Structura structuri) throws Exception;
    void afiseazaDescriere();
    Structura getStructura(int index) throws Exception;
}
