package ro.cts.clase;

public class NotaDePlataRevelion extends PrinterFelicitare{

    public NotaDePlataRevelion(Nota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!");
    }
}
