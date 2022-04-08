package sem6_simple_factory_clase_transport;

public class Tramvai extends MijlocTransport {
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Tramvaiul are numarul din inmatriculare "+this.getNrInmatriculare()+".");
    }
}
