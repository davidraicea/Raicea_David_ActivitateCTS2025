package ro.cts.clase;

public class AdapterMedicamente extends MedicamentFarmacie{

    private MedicamentSpital medicamentSpital;
    public AdapterMedicamente(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getNumeMedicament(), "01/01/2026", true, medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }
    @Override
    public void cumparaMedicament(){
        super.cumparaMedicament();
    }
}
