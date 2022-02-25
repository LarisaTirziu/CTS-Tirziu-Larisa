package seminar1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private Ingrijitor ingrijitor;
    private List<Animal> animale;

    public void hranesteAnimale(){
        for (Animal a:animale) {
            ingrijitor.hranesteAnimal(a, "Orz");
        }
    }

    public Zoo(String nume, Ingrijitor ingrijitor) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        animale =new ArrayList<>();
    }

    public void adaugaAnimal(Animal a)
    {
        animale.add(a);
    }


}