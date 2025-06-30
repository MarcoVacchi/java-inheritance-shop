package org.lessons.java.shop;

import java.math.BigDecimal;

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
    public String getInfo() {
        String info = super.getInfo() +
                "Codice: " +
                this.codiceImei +
                " " +
                "Memoria: " +
                this.memoria;
        return info;
    }

}
