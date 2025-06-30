package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // -------------TELEFONO--------------;
        System.out.println("-----------------TELEFONO-------------");
        Smartphone telefono = new Smartphone("S-20", "Samsung", new BigDecimal(222), "328837372", 32);

        System.out.println(telefono.getInfo());
        System.out.println();
        System.out.println();

        // -------------TELEVISORE--------------;
        System.out.println("-----------------TELEVISORE-------------");
        Televisori televisore = new Televisori("HD-2332", "Ok.", new BigDecimal(300.22), 300, 200, true);
        System.out.println(televisore.getInfo());
        System.out.println();
        System.out.println();

        // -------------CUFFIE--------------;
        System.out.println("-----------------TELEVISORE-------------");

        Cuffie cuffia = new Cuffie("A-40", "Astro-gaming", new BigDecimal(320.22), "Nero", false);

        System.out.println(cuffia.getInfo());
    }
}
