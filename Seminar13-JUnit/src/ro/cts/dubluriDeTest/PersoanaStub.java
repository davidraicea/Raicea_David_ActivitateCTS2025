package ro.cts.dubluriDeTest;

import ro.cts.clase.IPersoana;

public class PersoanaStub implements IPersoana {
    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return 65;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
