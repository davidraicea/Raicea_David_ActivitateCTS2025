package ro.cts.program;

import ro.cts.clase.AdaptorClaseMedicament;
import ro.cts.clase.Farmacie;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    public static void main(String[] args){
        Farmacie farmacie = new Farmacie("Catena");
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("aspacardin", "01/01/2026",true,57.4f);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("teraflu", "21/03/2026",true,32.5f);

        farmacie.vindeMedicament(medicamentFarmacie1);
        farmacie.vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital = new MedicamentSpital("paracetamol", 24.9f);
        //farmacie.vindeMedicament(medicamentSpital);
        AdaptorClaseMedicament adaptorClaseMedicament = new AdaptorClaseMedicament("paracetamol",24.9f);
        farmacie.vindeMedicament(adaptorClaseMedicament);

    }
}
