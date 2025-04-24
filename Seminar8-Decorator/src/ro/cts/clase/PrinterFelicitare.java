package ro.cts.clase;

public abstract class PrinterFelicitare implements Nota { //decorator
    private Nota notaDePlata;

    public PrinterFelicitare(Nota notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
