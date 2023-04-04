package April;

public class Boot extends Wasserfahrzeug implements Fahrbar, Steuerbar {

    @Override
    public void fortbewegen() {
        System.out.println("Boot fährt");

    }

    @Override
    public void linksLenken() {
        System.out.println("Boot lenkt links");
    }
}
