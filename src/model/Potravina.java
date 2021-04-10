package model;

public abstract class Potravina extends Produkt {

    private String expiracia;

    public Potravina(double cena, String expiracia) {
        super(cena);

        this.expiracia = expiracia;
    }

    public String getExpiracia() {
        return expiracia;
    }

    public void setExpiracia(String expiracia) {
        this.expiracia = expiracia;
    }

}
