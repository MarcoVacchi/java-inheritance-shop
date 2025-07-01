package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffie(String nome, String marca, BigDecimal prezzo, String colore, boolean isWireless) {
        super(nome, marca, prezzo);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getIfIsWireless() {
        return this.isWireless;
    }

    public void setIfIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public BigDecimal getPrezzoScontato() {
        if (!isWireless) {
            BigDecimal sconto = new BigDecimal(0.07);
            return prezzo.subtract(prezzo.multiply(sconto).setScale(2, RoundingMode.DOWN));
        }
        return super.getPrezzoScontato();
    };

    @Override
    public String toString() {
        String info = super.toString() +
                " " +
                "Colore: " +
                this.colore +
                " " +
                "Funzionalità: ";
        if (isWireless == true) {
            info += "Le cuffie sono wireless!";
        } else {
            info += "Le cuffie non sono wireless!";
        }
        return info;
    }

}
