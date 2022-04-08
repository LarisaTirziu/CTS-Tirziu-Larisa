package main;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new AutobuzBuilder().setModel("Ford").setNumeSofer("Vasile").build();
        Autobuz autobuz1 = new AutobuzBuilder().setNrInmatriculare("fbshdjbf324").build();
     //   autobuz1.setTextDerulat("textul meu");
         System.out.println(autobuz.toString());
         System.out.println(autobuz1.toString());

    }


}
