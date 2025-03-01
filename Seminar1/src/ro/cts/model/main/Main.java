package ro.cts.model.main;

import ro.cts.model.personal.*;
import ro.cts.model.platforma.Curs;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Mihai",20, 1,1000));
        studenti.add(new Student("Ana",21, 2,1000));

        Profesor profesor = new Profesor("Adrian", 35, 22, 9586, 0.35f);

        Curs curs = new Curs("CTS", 4, profesor, studenti);
        curs.sustineExamen("05/05/2021");

        curs.getProfesor().preda();

        System.out.println("Venitul profesorului: " + ((Persoana)curs.getProfesor()).calculareVenit());

        curs.setProfesor(new Asistent("Popescu",27,5,5496));
        curs.sustineExamen("05/05/2021");

        curs.setProfesor(new Lector("Gigel", 54));
        curs.getProfesor().preda();
        curs.sustineExamen("05/05/2021");

    }
}