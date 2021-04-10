package model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Nakup implements Serializable {

    private Date datum;
    private ArrayList<Produkt> produkty = new ArrayList<>();

    public Nakup() {
        datum = new Date();
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public Date getDatum() {
        return datum;
    }

    public String getVypis() {
        StringBuilder sb = new StringBuilder();
        sb.append("NAKUP ");
        sb.append(getDatum());
        sb.append(" -> ");
        for (Produkt p : getProdukty()) {
            sb.append(p.getName());
            sb.append(" ");
        }
        return sb.toString();
    }

}
