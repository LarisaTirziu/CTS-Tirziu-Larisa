package seminar1;

public class Zebra extends Animal{
    public Zebra(String nume) {
        super(nume);
    }

    @Override
    protected void mananca(String mancare) {
        System.out.println("Zebra "+ super.getNume()+" a mancat "+ mancare);
    }
}
