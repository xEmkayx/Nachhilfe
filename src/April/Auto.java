package April;

public class Auto implements Fahrbar, Steuerbar{

    @Override
    public void fortbewegen() {
        System.out.println("Auto fährt");
    }

    @Override
    public void linksLenken() {
        System.out.println("Auto lenkt links");
    }
}
