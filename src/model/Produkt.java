package model;

import java.io.Serializable;

public abstract class Produkt implements Named, Serializable {

    private double cena;

    /*
    public Produkt() {
        this.meno = "";
        this.cena = 0;
    }
    */

    public Produkt(double cena) {
        this.cena = cena;
    }

    public void vypis() {
        System.out.println("Produkt ma nazov " + getName());
    }

    // overloaded:
    /*
    public void vypis(String sklad) {
        System.out.println("Produkt ma nazov " + meno + " , a je v sklade " + sklad  + ".");
    }
    */

    public double getCena() {
        return cena;
    }

}
