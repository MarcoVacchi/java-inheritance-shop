package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    public String codiceImei;
    public String memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, String codiceImei, String memoria) {
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

    public String getMemoria() {
        return this.memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override

    public String toString() {
        String info = super.toString() +
                "Codice: " +
                this.codiceImei +
                " " +
                "Memoria: " +
                this.memoria;
        return info;
    }
};
