package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisori extends Prodotto {
    private int pollici;
    private boolean isSmart;

    public Televisori(String nome, String marca, BigDecimal prezzo, int pollici, boolean isSmart) {
        super(nome, marca, prezzo);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }

    public int getPollici() {
        return this.pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean getIfIsSmart() {

        return this.isSmart;
    }

    public void setIfIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public BigDecimal getPrezzoScontato() {
        if (!isSmart) {
            BigDecimal sconto = new BigDecimal("0.10");
            return prezzo.subtract(prezzo.multiply(sconto)).setScale(2, RoundingMode.DOWN);
        } else {
            return super.getPrezzoScontato();
        }
    }

    @Override
    public String toString() {
        String info = "Pollici: " + this.pollici + " pollici ";
        if (isSmart == true) {
            info += "Questo televisore è smart";
        } else {
            info += "Questo televisore non è smart";
        }
        return super.toString() + info;
    }
}
