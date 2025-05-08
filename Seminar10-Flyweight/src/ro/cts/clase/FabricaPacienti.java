package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String,PacientAbstract> colectiePacienti;


    public FabricaPacienti() {
        this.colectiePacienti = new HashMap<String,PacientAbstract>();
    }

    public PacientAbstract getPacient(String numarTelefon) throws Exception {
        PacientAbstract pacient = colectiePacienti.get(numarTelefon);
        if(pacient == null)
        {
            throw new Exception("Numarul de telefon nu a fost gasit.");
        }
        else
        {
            return pacient;
        }

    }

    public PacientAbstract getPacient(String nume, String telefon, String adresa)
    {
        PacientAbstract pacient = colectiePacienti.get(telefon);
        if(pacient == null)
        {
            pacient = new Pacient(nume,telefon,adresa);
            colectiePacienti.put(telefon,pacient);
            System.out.println("Pacientul a fost adaugat.");
        }
        return pacient;
    }

}
