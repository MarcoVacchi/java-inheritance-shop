package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int larghezza;
    private int altezza;
    private boolean isSmart;

    public Televisori(String nome, String marca, BigDecimal prezzo, int larghezza, int altezza, boolean isSmart) {
        super(nome, marca, prezzo);
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.isSmart = isSmart;
    }

    public int getLarghezza() {
        return this.larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getaltezza() {
        return this.altezza;
    }

    public void setaltezza(int altezza) {
        this.altezza = altezza;
    }

    public boolean getIfIsSmart() {

        return this.isSmart;
    }

    public void setIfIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        String info = "Dimensioni: " + this.larghezza + "x"
                + this.altezza + "cm ";
        if (isSmart == true) {
            info += "Questo televisore è smart";
        } else {
            info += "Questo televisore non è smart";
        }
        return super.toString() + info;
    }
}
