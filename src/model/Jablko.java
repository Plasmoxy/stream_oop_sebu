package model;

public class Jablko extends Potravina {

    public Jablko(String expiracia) {
        super(0.30, expiracia);
    }

    public void spadniZoStromu() {
        System.out.println("Jablko spadlo zo stromu, a malo cenu + " + getCena());
    }

    @Override
    public String getName() {
        return "Jablko";
    }
}
