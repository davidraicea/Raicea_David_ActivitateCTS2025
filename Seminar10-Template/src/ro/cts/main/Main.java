package ro.cts.main;

import ro.cts.clase.Pacient;
import ro.cts.clase.SpitalPrivat;
import ro.cts.clase.SpitalPublic;
import ro.cts.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Andrei",5);
        TemplateInternare spital = new SpitalPublic("spital");
        spital.internare(pacient);
        TemplateInternare spital2 = new SpitalPrivat();
        spital2.internare(pacient);
    }
}
