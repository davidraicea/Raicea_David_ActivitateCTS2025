package ro.cts.clase;

public class SpitalPrivat extends TemplateInternare{
    @Override
    int analizaDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Avem paturi suficiente.");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pentru pacientul " +pacient.getNume() + " a fost emisa fisa de internare.");
    }
}
