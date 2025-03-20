package ro.cts.fabrica;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaCocos;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class FabricaDeSupe {
    private float pret;
    private float calorii;

    public FabricaDeSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupa(TipSupa tipSupa,int cantitate){
        switch (tipSupa){
            case Vita -> {
                return (new SupaVita(this.pret,cantitate, this.calorii));
            }
            case Cocos -> {
                return (new SupaCocos(this.pret,cantitate, this.calorii));
            }
            case Legume -> {
                return (new SupaLegume(this.pret,cantitate, this.calorii));
            }
        }
        return null;
    }
}
