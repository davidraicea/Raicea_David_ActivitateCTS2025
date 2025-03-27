package ro.cts.clase;

public interface AbstractFactory {
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare,float pret,
                                           float calorii);
}
