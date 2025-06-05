package ro.cts.dubluriDeTest;

import ro.cts.clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private int varsta = 22;
    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
