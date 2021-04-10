package model;

public class Saris extends AdultProdukt {

    public Saris() {
        super(0.80);
    }

    @Override
    public void vypis() {
        System.out.println("SARIS FAJNA 12ka vyborna MMMMMMMMMMMMMMMMMMMM");
    }

    @Override
    public String getName() {
        return "Saris POGU";
    }
}
