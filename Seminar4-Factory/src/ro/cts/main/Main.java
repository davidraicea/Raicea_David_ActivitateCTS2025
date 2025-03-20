package ro.cts.main;

import ro.cts.clase.Supa;
import ro.cts.fabrica.FabricaDeSupe;
import ro.cts.fabrica.TipSupa;

public class Main {
    public static void main(String[] args){
        FabricaDeSupe fabricaDeSupe = new FabricaDeSupe(20.5f, 600);
        Supa supaLegume = fabricaDeSupe.getSupa(TipSupa.Legume,200);
        Supa supaCocos = fabricaDeSupe.getSupa(TipSupa.Cocos,250);
        Supa supaVita = fabricaDeSupe.getSupa(TipSupa.Vita,350);
        supaVita.afiseazaDescriere();
        supaLegume.afiseazaDescriere();
        supaCocos.afiseazaDescriere();
    }
}
