package ro.cts.teste;

import ro.cts.clase.Persoana;
import ro.cts.exceptii.ExceptieCnpInexistent;
import ro.cts.exceptii.ExceptieCnpInvalid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetVarstaTest {

    private Persoana persoana;
    @org.junit.Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    //Right-BICEP
    @org.junit.Test
    public void getVarstaRight() {
        persoana = new Persoana("Andrei", "2920221484692");
        int varsta = persoana.getVarsta();
        assertEquals(33,varsta);
    }

    @org.junit.Test
    public void getVarstaRight2() {
        persoana = new Persoana("Andrei", "5030221484692");
        int varsta = persoana.getVarsta();
        assertEquals(22,varsta);
    }

    @org.junit.Test
    public void getVarstaBoundary() {
        persoana = new Persoana("Andrei", "2991231484692");
        int varsta = persoana.getVarsta();
        assertEquals(25,varsta);
    }

    @org.junit.Test
    public void getVarstaBoundary2() {
        persoana = new Persoana("Andrei", "5000101484692");
        int varsta = persoana.getVarsta();
        assertEquals(25,varsta);
    }

    @org.junit.Test(expected = ExceptieCnpInvalid.class)
    public void getVarstaErrorCondition() {
        persoana = new Persoana("Andrei", "292b221484692");
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test(expected = ExceptieCnpInvalid.class)
    public void getVarstaErrorCondition2() {
        persoana = new Persoana("Andrei", "2921232484692");
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test(timeout = 100)
    public void getVarstaPerformance()  {
        persoana = new Persoana("Andrei", "2921221484692");
        int varsta = persoana.getVarsta();
    }

    //CORRECT

    //Conformance poate fi considerat facut

    @org.junit.Test
    public void getVarstaOrder() {
        persoana = new Persoana("Andrei", "2981221484692");
        Persoana persoana1 = new Persoana("Andra", "5001221484692");
        assertTrue(persoana.getVarsta() > persoana1.getVarsta());
    }

    //Range poate fi considerat facut (Boundaries)

    @org.junit.Test(expected = ExceptieCnpInexistent.class)
    public void getVarstaExistance() {
        persoana = new Persoana("Andrei", null);
        persoana.getVarsta();
    }

    @org.junit.Test
    public void getVarstaCardinality() {
        persoana = new Persoana("Andrei", "5250101484692");
        assertEquals(0,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaCardinalit2() {
        persoana = new Persoana("Andrei", "5240301484692");
        assertEquals(1,persoana.getVarsta());
    }


}