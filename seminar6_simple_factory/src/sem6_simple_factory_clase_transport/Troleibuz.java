package sem6_simple_factory_clase_transport;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Trolebuzul are numarul din inmatriculare "+this.getNrInmatriculare()+".");
    }
}
