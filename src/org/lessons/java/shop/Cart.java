package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {

    private static Scanner input = new Scanner(System.in);
    private static Prodotto[] cart = new Prodotto[0];
    private static int cartIndex = 0;
    private static boolean isComplete = true;

    public static void main(String[] args) {

        while (isComplete) {
            System.out.print("Inserisci un articolo fra cuffie, televisori o e smartphone: ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("cuffie")) {
                addCuffie();
                // addToCart(null);

            } else if (name.equalsIgnoreCase("televisori")) {
                addTelevisori();

            } else if (name.equalsIgnoreCase("smartphone")) {
                addSmarthpone();
            } else {
                System.out.println("Articolo non presente nel nostro negozio!");
            }

            // System.out.println(cart.length);
        }
        stampaCarrello();
    }

    public static void addToCart(Prodotto prodotto) {
        Prodotto[] newCart = new Prodotto[cartIndex + 1];
        for (int i = 0; i < cartIndex; i++) {
            newCart[i] = cart[i];
        }
        newCart[cartIndex] = prodotto;
        cart = newCart;
        cartIndex++;
    }

    public static void stampaCarrello() {
        for (Prodotto prodotto : cart) {
            System.out.println(prodotto.toString());
        }
    }

    public static void addCuffie() {
        System.out.print("Scrivi nome prodotto: ");
        String name = input.nextLine();

        System.out.print("Scrivi marca prodotto: ");
        String marca = input.nextLine();

        System.out.print("Scrivi prezzo prodotto: ");
        BigDecimal prezzo = input.nextBigDecimal();
        input.nextLine();
        System.out.print("Scrivi colore prodotto: ");
        String colore = input.nextLine();

        System.out.print("Scrivi se sarà wireless: ");
        boolean isWireless = input.nextBoolean();

        Cuffie cuffia = new Cuffie(name, marca, prezzo, colore, isWireless);
        isComplete = answerUser();
        addToCart(cuffia);
    }

    public static void addTelevisori() {
        System.out.print("Scrivi nome prodotto: ");
        String name = input.nextLine();

        System.out.print("Scrivi marca prodotto: ");
        String marca = input.nextLine();

        System.out.print("Scrivi prezzo prodotto: ");
        BigDecimal prezzo = input.nextBigDecimal();

        System.out.print("Scrivi larghezza prodotto: ");
        int larghezza = input.nextInt();

        System.out.print("Scrivi altezza prodotto: ");
        int altezza = input.nextInt();

        System.out.print("Scrivi se sarà smart: ");
        boolean isSmart = input.nextBoolean();

        Televisori tv = new Televisori(name, marca, prezzo, larghezza, altezza, isSmart);
        isComplete = answerUser();
        addToCart(tv);
    }

    public static void addSmarthpone() {
        System.out.print("Scrivi nome prodotto: ");
        String name = input.nextLine();

        System.out.print("Scrivi marca prodotto: ");
        String marca = input.nextLine();

        System.out.print("Scrivi prezzo prodotto: ");
        BigDecimal prezzo = input.nextBigDecimal();

        System.out.print("Scrivi codiceImei prodotto: ");
        String codiceImei = input.nextLine();

        System.out.print("Scrivi memoria(GB) prodotto: ");
        String memoria = input.nextLine();

        Smartphone telefono = new Smartphone(name, marca, prezzo, codiceImei, memoria);
        isComplete = answerUser();
        addToCart(telefono);
    }

    public static boolean answerUser() {
        input.nextLine();
        System.out.print("Scrivi continua percontinuare gli acquisti: ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Continua")) {
            return true;
        }
        System.out.println("Totale carrello: ");

        return false;
    }

}

// Bonus:
// Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato
// per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%.
// Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore
// a 32GB, altrimenti rimane del 2%.

// Per i Televisori lo sconto è del 10% se la televisione non è smart,
// altrimenti rimane del 2%.