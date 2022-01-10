package model;

public class Produkt {

    private String name;
    private int preis;
    private int sku;
    private int anzahl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public Produkt(String name, int preis, int sku, int anzahl) {
        this.name = name;
        this.preis = preis;
        this.sku = sku;
        this.anzahl = anzahl;
    }
}
