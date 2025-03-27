package ro.cts.clase;

public class FactoryDesert implements AbstractFactory{
    public void setCrema(String crema) {
        this.crema = crema;
    }

    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare,
                                           float pret, float calorii) {
        switch ((Deserturi) tipFelDeMancare){
            case tiramisu -> {
                return new Tiramisu(pret,calorii,crema);
            }
            case papanasi -> {
                return new Papanasi(pret,calorii,crema);
            }
             default -> {
                return null;
            }
        }
    }
}
