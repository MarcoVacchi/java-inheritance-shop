package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected BigDecimal iva;

    protected Prodotto(String nome, String marca, BigDecimal prezzo) {
        Random random = new Random();
        this.nome = nome;
        this.codice = random.nextInt(999999999);
        this.marca = marca;
        this.prezzo = prezzo.setScale(2, RoundingMode.DOWN);
        this.iva = new BigDecimal(0.22);
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

    public BigDecimal getPrezzoScontato() {

        BigDecimal sconto = new BigDecimal("0.02");
        return prezzo.subtract(prezzo.multiply(sconto)).setScale(2, RoundingMode.DOWN);
    }

    public String toString() {

        return "Nome: " + this.nome + " " +
                "Marca: " + this.marca + " " +
                "Prezzo: " + this.prezzo + "$" + " ";
    }

};

// Bonus:
// Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato

// per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%.

// Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore

// a 32GB, altrimenti rimane del 2%.
// Per i Televisori lo sconto è del 10% se la televisione non è smart,
// altrimenti rimane del 2%.

// Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.

// Nella classe carrello chiedere all’utente se possiede una carta fedeltà
// In base alla risposta, calcolare il totale del carrello come somma dei prezzi
// base o dei prezzi scontati.