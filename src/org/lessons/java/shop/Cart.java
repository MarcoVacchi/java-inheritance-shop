package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {

    private static Scanner input = new Scanner(System.in);
    private static Prodotto[] cart = new Prodotto[0];
    private static int cartIndex = 0;
    private static boolean isComplete = true;
    private static boolean hasFidelty = false;

    public static void main(String[] args) {

        System.out.print("Possiedi la carta fedeltà? (true/false): ");
        hasFidelty = input.nextBoolean();
        input.nextLine();

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
        BigDecimal totale = BigDecimal.ZERO;
        BigDecimal totaleScontato = BigDecimal.ZERO;

        for (Prodotto prodotto : cart) {
            System.out.println(prodotto.toString());
            totale = totale.add(prodotto.getPrezzo());

            if (hasFidelty) {
                totaleScontato = totaleScontato.add(prodotto.getPrezzoScontato());
            }
        }

        System.out.println("Totale carrello (senza sconto): " + totale + "$");

        if (hasFidelty) {
            System.out.println("Totale carrello (con sconto fedeltà): " + totaleScontato + "$");
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

        System.out.print("Scrivi pollici televisore: ");
        int pollici = input.nextInt();

        input.nextLine();

        System.out.print("Scrivi se sarà smart: ");
        boolean isSmart = input.nextBoolean();

        Televisori tv = new Televisori(name, marca, prezzo, pollici, isSmart);
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
        int memoria = input.nextInt();

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
