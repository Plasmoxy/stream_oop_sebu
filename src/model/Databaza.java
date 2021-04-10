package model;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;

public class Databaza implements Serializable {

    // singleton pattern:
    private static Databaza instance;
    private Databaza() {}
    public static Databaza getInstance() {
        if (instance == null) {
            instance = new Databaza();
        }
        return instance;
    }

    public ArrayList<Nakup> nakupy = new ArrayList<>();

    public void vypisNakupy() {
        for (Nakup n: nakupy) {
            System.out.println(n.getVypis());
        }
    }

    public static void save() {
        try {
            FileOutputStream fo = new FileOutputStream("ne.ser");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(instance);

            System.out.println("SAVED");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void load() {
        try {
            FileInputStream fi = new FileInputStream("ne.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            instance = (Databaza) oi.readObject();
            System.out.println("LOADED");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
