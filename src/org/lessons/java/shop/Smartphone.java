package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Prodotto {

    public String codiceImei;
    public int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, String codiceImei, int memoria) {
        super(nome, marca, prezzo);
        this.codiceImei = codiceImei;
        this.memoria = memoria;
    }

    public String getCodiceImei() {
        return this.codiceImei;
    }

    public void setCodiceImei(String codiceImei) {
        this.codiceImei = codiceImei;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public BigDecimal getPrezzoScontato() {
        if (memoria < 32) {
            BigDecimal sconto = new BigDecimal("0.05");
            return prezzo.subtract(prezzo.multiply(sconto)).setScale(2, RoundingMode.DOWN);
        } else {
            return super.getPrezzoScontato();
        }
    }

    @Override

    public String toString() {
        String info = super.toString() +
                "Codice: " +
                this.codiceImei +
                " " +
                "Memoria: " +
                this.memoria +
                "GB";
        return info;
    }
};
