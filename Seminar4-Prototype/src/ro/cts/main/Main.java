package ro.cts.main;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareExterior;

public class Main {
    public static void main(String[] args){
        AbstractRezervare rezervareExterior = new RezervareExterior(12,15,"Cristi",12,true);
        AbstractRezervare rezervareExterior2 = rezervareExterior.copiaza(3);
        AbstractRezervare rezervareExterior3 = rezervareExterior.copiaza(4);
        System.out.println(rezervareExterior);
        System.out.println(rezervareExterior2);
        System.out.println(rezervareExterior3);
        rezervareExterior.setZiuaLunii(20); //copiaza face acest lucru acum
        System.out.println(rezervareExterior);
        System.out.println(rezervareExterior2);
        System.out.println(rezervareExterior3);


    }
}
