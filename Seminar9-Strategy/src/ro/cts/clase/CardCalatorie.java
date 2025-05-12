package ro.cts.clase;

public class CardCalatorie implements IMetodaPlata{
    private int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.nrCalatoriiRamase > 0){
            this.nrCalatoriiRamase--;
            System.out.println("Ati platit calatoria. Mai aveti " + this.nrCalatoriiRamase+ " calatorii.");
        }
        else{
            System.out.println("Nu mai aveti calatorii ramase.");
        }
    }
}
