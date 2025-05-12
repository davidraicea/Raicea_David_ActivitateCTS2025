package ro.cts.clase;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.sold >= pretBilet){
            this.sold -= pretBilet;
            System.out.println("Ati platit calatoria. Sold ramas: " + this.sold+ " lei.");
        }
        else{
            System.out.println("Sold insuficient.");
        }
    }
}
