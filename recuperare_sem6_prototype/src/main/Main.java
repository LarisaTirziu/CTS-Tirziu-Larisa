package main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Andrei");
        Autobuz autobuz2;

        try {
            autobuz2 = (Autobuz) autobuz.copiaza();
            autobuz2.setNumeSofer("Matei");
            System.out.println(autobuz.getNumeSofer());
            System.out.println(autobuz2.getNumeSofer());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
