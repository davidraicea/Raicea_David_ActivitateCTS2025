package ro.cts.clase;

public class PlataSMS implements IMetodaPlata{
    public PlataSMS() {
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ai platit prin SMS.");
    }
}
