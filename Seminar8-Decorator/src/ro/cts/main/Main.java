package ro.cts.main;

import ro.cts.clase.Nota;
import ro.cts.clase.NotaDePlata;
import ro.cts.clase.NotaDePlataCraciun;
import ro.cts.clase.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args){
        Nota notaDePlata = new NotaDePlata(500.5f);
        notaDePlata.printare();
        Nota notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.printare();
        Nota notaDecorata2 = new NotaDePlataCraciun(notaDePlata);
        notaDecorata2.printare();
        Nota notaDecorata3 = new NotaDePlataCraciun(notaDecorata);
        notaDecorata3.printare();



    }
}
