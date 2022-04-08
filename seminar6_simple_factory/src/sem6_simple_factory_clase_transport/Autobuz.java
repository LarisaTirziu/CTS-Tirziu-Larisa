package sem6_simple_factory_clase_transport;

public class Autobuz extends MijlocTransport{

    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Autobuzul are numarul din inmatriculare "+this.getNrInmatriculare()+".");
    }
}
