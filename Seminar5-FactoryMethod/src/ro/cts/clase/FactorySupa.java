package ro.cts.clase;

public class FactorySupa implements AbstractFactory{
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    private int cantitate;

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch ((Supe) tipFelDeMancare){
            case supaDeLegume -> {
                return new SupaDeLegume(pret,calorii,cantitate);
            }
            case supaDeCiuperci -> {
                return new SupaDeCiuperci(pret,calorii,cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
