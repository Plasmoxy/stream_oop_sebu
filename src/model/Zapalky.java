package model;

public class Zapalky extends Produkt {

    public String znacka = "";

    public Zapalky(String znacka) {
        super(0.20);
        this.znacka = znacka;
    }

    @Override
    public String getName() {
        return "Zapalky";
    }
}
