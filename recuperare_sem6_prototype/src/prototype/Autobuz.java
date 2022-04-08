package prototype;

public class Autobuz implements MijlocTransport{
    private String numeSofer;

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public Autobuz(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (Tramvai) super.clone();
    }
}
