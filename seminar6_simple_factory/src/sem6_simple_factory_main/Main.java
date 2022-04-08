package sem6_simple_factory_main;

import sem6_simple_factory.Fabrica;
import sem6_simple_factory_clase_transport.MijlocTransport;
import sem6_simple_factory_clase_transport.TipTransport;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        MijlocTransport autobuz =  fabrica.returneazaMijlocTransport(TipTransport.Autobuz,"214edfsdtwe");
        MijlocTransport tramvai =  fabrica.returneazaMijlocTransport(TipTransport.Tramvai,"214erwesfsdtwe");
        MijlocTransport troleibuz = fabrica.returneazaMijlocTransport(TipTransport.Troleibuz,"2sefsdftwe");

    autobuz.afisareNrInmatriculare();
    tramvai.afisareNrInmatriculare();
    troleibuz.afisareNrInmatriculare();
    }
}
