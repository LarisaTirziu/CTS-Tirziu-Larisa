package seminar1;

public class Girafa extends Animal{

    public Girafa(String nume) {
        super(nume);
    }

    @Override
    protected void mananca(String mancare) {
        System.out.println("Girafa "+ super.getNume()+" a mancat "+ mancare);
    }
}
