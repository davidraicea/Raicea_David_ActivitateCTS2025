package ro.cts.clase;

public abstract class TemplateInternare {

    abstract int analizaDificultate(Pacient pacient);
    abstract void verificareDisponibilitate();
    abstract void emitereFisa(Pacient pacient);
    public final void internare(Pacient pacient){
        if(analizaDificultate(pacient) < 3){
            System.out.println("Nu necesita internare");
        }
        else{
            verificareDisponibilitate();
            emitereFisa(pacient);
        }

    }
}
