package seminar1;

public abstract class Animal {
    private String nume;
    protected abstract void mananca(String mancare);

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Animal(String nume) {
        this.nume = nume;
    }
}
