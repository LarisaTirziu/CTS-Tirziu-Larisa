package main;

import seminar1.*;

public class Main {
    public static void main(String[] args) {
        Ingrijitor ingrijitor = new Ingrijitor("Ana Panturu");
        Zoo zoo = new Zoo("Gradina zoo bucuresti 1", ingrijitor );
        zoo.adaugaAnimal(new Girafa("Maria"));
        zoo.adaugaAnimal(new Zebra("Marty"));

        zoo.adaugaAnimal(new Girafa("Mara"));
        zoo.hranesteAnimale();

    }
}
