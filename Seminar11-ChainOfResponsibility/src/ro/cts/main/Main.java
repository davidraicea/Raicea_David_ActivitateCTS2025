package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        InfoMijloc troleibuz = new Troleibuz();
        InfoMijloc autobuz = new Autobuz();
        InfoMijloc tramvai = new Tramvai();
        InfoMijloc metrou = new Metrou();

        troleibuz.setUrmMijloc(autobuz);
        autobuz.setUrmMijloc(tramvai);
        tramvai.setUrmMijloc(metrou);


        troleibuz.recomandaMijloc(2);
        troleibuz.recomandaMijloc(4);
        troleibuz.recomandaMijloc(7);
        troleibuz.recomandaMijloc(12);
    }
}
