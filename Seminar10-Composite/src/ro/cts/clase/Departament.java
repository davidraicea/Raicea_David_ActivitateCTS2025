package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String nume;
    private int numarAngajati;
    private List<Structura> lista;

    public Departament(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
        lista=new ArrayList<Structura>();
    }

    @Override
    public void adaugaStructura(Structura structuri) throws Exception {
        lista.add(structuri);
    }

    @Override
    public void stergeStructura(Structura structuri) throws Exception {
        lista.remove(structuri);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamentul "+this.nume+" are "+this.numarAngajati+" angajati si urmatoarele subsectii: ");
        for(Structura structura : lista) {
            structura.afiseazaDescriere();
        }

    }

    @Override
    public Structura getStructura(int index) throws Exception {
        return lista.get(index);
    }
}
