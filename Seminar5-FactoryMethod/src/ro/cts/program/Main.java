package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupa = new FactorySupa(500);
        FactoryDesert factoryDesert = new FactoryDesert("vanilie");
        FelDeMancare supaDeLegume = factorySupa.creareFelDeMancare(Supe.supaDeLegume,
                20.5f, 450);
        factorySupa.setCantitate(499);
        FelDeMancare supaDeCiuperci = factorySupa.creareFelDeMancare(Supe.supaDeCiuperci,
                30.5f, 500);
        FelDeMancare tiramisu = factoryDesert.creareFelDeMancare(Deserturi.tiramisu,
                45f,489);
        System.out.println(supaDeLegume);
        System.out.println(supaDeCiuperci);
        System.out.println(tiramisu);

    }
}