package ro.cts.clase;

public class NotaDePlata implements Nota{
    private float totalDePlata;

    public NotaDePlata(float totatlDePlata) {
        this.totalDePlata = totatlDePlata;
    }

    @Override
    public void printare() {
        System.out.println("Aveti de plata suma de "+ totalDePlata +" RON.");
    }


}
