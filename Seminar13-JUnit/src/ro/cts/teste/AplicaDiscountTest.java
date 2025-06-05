package ro.cts.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.cts.categorii.CategorieBoundary;
import ro.cts.categorii.CategorieRight;
import ro.cts.clase.IPersoana;
import ro.cts.clase.PachetTuristic;
import ro.cts.dubluriDeTest.PersoanaFake;
import ro.cts.dubluriDeTest.PersoanaStub;

import static org.junit.Assert.*;

public class AplicaDiscountTest {

    @Test
    @Category({CategorieBoundary.class})
    public void aplicaDiscountVarstniciBoundaryTest() {
        IPersoana persoana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 500.00);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(425,pachetTuristic.getPret(),0.0001);
    }

    @Test
    @Category(CategorieRight.class)
    public void aplicaDiscountVarstniciRightOverTest() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(84);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Bali", 500.00);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(425,pachetTuristic.getPret(),0.0001);
    }

    @Test
    @Category(CategorieRight.class)
    public void aplicaDiscountVarstniciRightUnderTest() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(25);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Bali", 500.00);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(500,pachetTuristic.getPret(),0.0001);
    }



}