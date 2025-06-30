package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int codice;
    public String nome;
    public String marca;
    public BigDecimal prezzo;
    public BigDecimal iva;

    protected Prodotto(String nome, String marca, BigDecimal prezzo) {
        Random random = new Random();
        this.nome = nome;
        this.codice = random.nextInt(999999999);
        this.marca = marca;
        this.prezzo = prezzo.setScale(2, RoundingMode.DOWN);
        this.iva = new BigDecimal(22);
    }

    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getInfo() {
        return "Nome: " + this.nome + " " +
                "Marca: " + this.marca + " " +
                "Prezzo: " + this.prezzo + "$" + " ";
    }
}
