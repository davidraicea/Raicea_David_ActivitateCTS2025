package ro.cts.clase;

public class Receptionist { //facade
    public String poateLuaLocLaMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if(masa.isEsteLibera()){
            if(picolo.esteDebarasata(masa)){
                if(ospatar.esteAranjataMasa(masa)){
                    return "Va rog, luati loc la masa "+masa.getNumarMasa()+"!";
                }
                else{
                   return "Asteptati sa aranjam masa!";
                }
            }
            else{
                return "Asteptati putin, tocmai s-a ridicat cineva!";
            }
        }
        else {
            return "Masa nu este disponibila.";
        }
    }


}
